package com.example.consomi.entity;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Component
@Table(name = "EVENT")
public class Event implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEvent;

	private float cout;

	@Temporal(TemporalType.DATE)
	@Column(name= "date")
	private Date dateEvent;

	private String titre;

	private String description;

	@OneToOne
	private User admin;

	@OneToOne
	private Cagnotte cagnotte;

	public Event(int id)
	{
		this.idEvent=id;
	}

	
	

}
