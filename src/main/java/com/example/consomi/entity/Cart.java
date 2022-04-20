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
@Table( name = "T_CART")
public class Cart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idCart;
	
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	@Column
	private int quantite;
	@Column
	private float total;

	@OneToOne
	private Product produit;

	@OneToOne(mappedBy = "cart")
	private Donation donation;

	@ManyToOne
	private Commande commande;
	

	

}
