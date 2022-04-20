package com.example.consomi.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_MESSAGE")
public class Message implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMessage;

	@Column(columnDefinition = "MEDIUMTEXT")
	private String content;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@ManyToOne
	private Client sender;

	@ManyToOne
	private Client receiver;

}
