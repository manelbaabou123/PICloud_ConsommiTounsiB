package com.example.consomi.entity;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
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


	@OneToMany(cascade = CascadeType.ALL,mappedBy = "event")
	private List<Cagnotte> cagnotte;

	/*public Event(int id)
	{
		this.idEvent=id;
	}
*/
	
	

}
