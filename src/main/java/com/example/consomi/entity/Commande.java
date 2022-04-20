package com.example.consomi.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
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
@ToString
@Component
@Table( name = "T_COMMANDE")
public class Commande implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idCommande;

	@Column
	private float total;
	
	
	@Enumerated(EnumType.STRING)
	private OrderStatus etat;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOrder;
	
	
	@OneToMany(mappedBy="commande")
	private List<Cart> carts;

	@OneToOne(mappedBy="commande")
	private Delivery livraison;
	
	public Commande(int idCommande)
	{
		this.idCommande=idCommande;
	}
}
