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
@Table( name = "CART")
public class Cart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idCart;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_Creation")
	private Date dateCreation;

	private int quantite;

	private float total;

	@OneToOne
	private Product produit;

	@ManyToOne
	@JoinColumn(name="idCommande")
	private Commande commande;
	

	

}
