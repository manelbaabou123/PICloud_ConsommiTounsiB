package com.example.consomi.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
//@DiscriminatorValue("Admin")
public class Admin extends User implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@Column
	//private String name;

	//@Column
	//private String subName;

	@OneToMany
	private List<Product> products;

	@OneToMany
	private List<Event> events;

	@OneToMany
	private List<Delivery> livreurs;
	
	

}
