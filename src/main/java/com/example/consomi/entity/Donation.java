package com.example.consomi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "T_DONATION")
public class Donation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idDonation;
	
	@Column
	private int nbProduct;
	
	@Column
	private Client clienNess;
	
	@OneToOne
	private Cart cart;
	
}
