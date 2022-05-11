package com.example.consomi.entity;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Component

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

	private Date dateEvent;

	private String titre;

	private String description;


	@OneToOne
	private Cagnotte cagnotte;

	@ManyToMany
	private List<User> participants;

	/*public Event(int id)
	{
		this.idEvent=id;
	}
*/
	
	

}
