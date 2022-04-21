package com.example.consomi.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "MESSAGE")
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
	//@JoinColumn(name = "idUser")
	private User sender;

	@ManyToOne
	//@JoinColumn(name = "idUser")
	private User receiver;

}
