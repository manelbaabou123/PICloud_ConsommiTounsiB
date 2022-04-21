package com.example.consomi.entity;


import lombok.*;
import org.springframework.stereotype.Component;
import com.example.consomi.enumerated.OrderStatus;

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
@Table( name = "COMMANDE")
public class Commande implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idCommande;

	private float total;

	@Enumerated(EnumType.STRING)
	private OrderStatus etat;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date")
	private Date dateOrder;

	@OneToOne
	private Facture facture;

	@OneToMany(mappedBy="commande")
	private List<Cart> carts;

	@OneToOne(mappedBy="commande")
	private Delivery livraison;
	
	public Commande(int idCommande)
	{
		this.idCommande=idCommande;
	}
}
