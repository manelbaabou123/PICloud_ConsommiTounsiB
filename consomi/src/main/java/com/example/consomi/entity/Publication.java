package com.example.consomi.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "PUBLICATION")
public class Publication implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPub;

	@NotEmpty(message = "Please provide a Title")
	private String title;

	@NotEmpty(message = "Please provide a description for your Publication")
	private String description;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "date")
	private Date dateCreation;

	@OneToMany(mappedBy = "pub", fetch = FetchType.EAGER)
	private List<RatingPub> ratPub;

	@ManyToOne
	@JoinColumn(name = "idUser")
	private User client;

	
	
}
