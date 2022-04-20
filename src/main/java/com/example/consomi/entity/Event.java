package com.example.consomi.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Component
@Table(name = "T_EVENT")
public class Event implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	private Admin fondateur;

	@Column
	private float cout;
	
	
	@Temporal(TemporalType.DATE)
	private Date dateEvent;
	
	@Column
	private String titre;
	
	@Column
	private String description;

	//@OneToOne
	//private Cagnotee cagnotee;

	public Event(int id)
	{
		this.id=id;
	}

	
	

}
