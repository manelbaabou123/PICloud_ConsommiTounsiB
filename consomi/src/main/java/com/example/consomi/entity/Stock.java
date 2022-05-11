package com.example.consomi.entity;

import lombok.*;
import com.example.consomi.enumerated.StockStatus;

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
@Table(name = "STOCK")
public class Stock implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idStock;

	private float quantite;

	@Column(name = "prix_Achat")
	private float prixAchat;

	@Column(name = "prix_Vente")
	private float prixVente;

	@Column(name = "quantite_Vendu")
	private float quantiteVendu;

	@Column(name = "date_Achat")
	@Temporal(TemporalType.DATE)
	private Date dateAchat;

	@Enumerated(EnumType.STRING)
	private StockStatus etat;


	@OneToMany(mappedBy="stock")
	private List<Product> produits;
	

}
