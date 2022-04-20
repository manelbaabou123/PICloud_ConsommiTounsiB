package com.example.consomi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "T_FACTURE")
public class Facture implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idFact;
	
	@Column
	private float total;
	@Column
	private Date date;
	
	@OneToOne(mappedBy = "facture")
	private Delivery livraison;
}
