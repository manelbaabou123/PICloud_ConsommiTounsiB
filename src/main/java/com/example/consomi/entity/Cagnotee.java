package com.example.consomi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Getter 
@Setter
@Table( name = "T_CAGNOTE")
public class Cagnotee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column
	private int idCgnote;
	@Column
	private int mongton;
	@Column
	private Date date;
	
	//@OneToOne(mappedBy = "cagnotee")
	//private Event event;
	
	
	

}
