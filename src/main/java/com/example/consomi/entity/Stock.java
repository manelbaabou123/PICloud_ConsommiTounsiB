package com.example.consomi.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import com.example.consomi.enumerated.StockStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "T_STOCK")
public class Stock implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idStock;

	
	@Column
	private float quantite;
	
	@Column
	private float prixAchat;
	
	@Column
	private float prixVente;
	
	@Column
	private float quantiteVendu;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dateAchat;
	
	@Column
	@Enumerated(EnumType.STRING)
	private StockStatus etat;
	
	
	@OneToMany(mappedBy="stock")
	private List<Product> produits;
	

}
