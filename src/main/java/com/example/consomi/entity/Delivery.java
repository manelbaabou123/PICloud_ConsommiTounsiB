package com.example.consomi.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
import com.example.consomi.enumerated.DeliveryStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
@Table(name = "T_DELIVERY")
public class Delivery implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long idDelivery;

	@Column
	private float cout;


	@Column
	@Enumerated(EnumType.STRING)
	private DeliveryStatus etat;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date DeliveryDate = new Date(System.currentTimeMillis());
	//private LocalDate DeliveryDate = LocalDate.now();


	public Delivery(int idDelivery)
	{
		this.idDelivery=idDelivery;
	}


	
	@OneToOne
	private Facture facture;

	@ManyToOne
	@JoinColumn(name = "idDeliveryMan")
	private DeliveryMan livreur;

	@OneToOne
	private Commande commande;

	@OneToOne(mappedBy = "livraison")
	private Reclamation reclamation;

	@JsonBackReference
	public DeliveryMan getLivreur() {
		return livreur;
	}

	public void setLivreur(DeliveryMan livreur) {
		this.livreur = livreur;
	}

	public DeliveryStatus getEtat() {
		return etat;
	}

	public void setEtat(DeliveryStatus etat) {
		this.etat = etat;
	}
}
