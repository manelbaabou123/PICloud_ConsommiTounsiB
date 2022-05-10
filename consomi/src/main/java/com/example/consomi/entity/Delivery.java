package com.example.consomi.entity;


import com.example.consomi.enumerated.DeliveryStatus;
import com.example.consomi.enumerated.MeansOfTransportDelivery;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
//@Component
@Table(name = "DELIVERY")
public class Delivery implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long idDelivery;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date")
	private Date DeliveryDate = new Date(System.currentTimeMillis());

	private String ville;

	//private String imageUrl;

	@Column(name = "address")
	private String addressLivraison;

	@Column(name = "frais_Livraison")
	private float frais;

	@Enumerated(EnumType.STRING)
	@Column(name = "moy_Trasport")
	private MeansOfTransportDelivery meansOfTransport;

	@Enumerated(EnumType.STRING)
	private DeliveryStatus etat;

	public Delivery(int idDelivery)
	{
		this.idDelivery=idDelivery;
	}


	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "idDeliveryMen")
	private DeliveryMen livreur;

	@OneToOne
	private Commande commande;

	@OneToOne(mappedBy = "livraison")
	private Reclamation reclamation;

	//@JsonBackReference
	//public DeliveryMen getLivreur() {
	//	return livreur;
	//}

	//public void setLivreur(DeliveryMen livreur) {
	//	this.livreur = livreur;
	//}

	//public DeliveryStatus getEtat() {
	//	return etat;
	//}

	//public void setEtat(DeliveryStatus etat) {
	//	this.etat = etat;
	//}
}
