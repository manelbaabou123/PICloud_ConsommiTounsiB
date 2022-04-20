package com.example.consomi.entity;

import lombok.*;

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
@Table(name = "T_PRODUCT")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProduct;
	
	@Column(name="name")
	private String nameProduct;
	
	@Column(name = "description")
	private String descriptionProduct;

	@Column(name = "price")
	private float priceProduct;

	@Column(name = "dateCreation")
	@Temporal(TemporalType.DATE)
	private Date dateCreationProduct;

	@Column(name = "dateEndNew")
	@Temporal(TemporalType.DATE)
	private Date dateEndNewProduct;

	@Column(name = "image")
	private String imageFileNameProduct;

	@Column(name = "barcode")
	private String barcodeProduct;
	
	@ManyToOne
	private Category category;

	@ManyToOne
	private Client client;

	@ManyToOne
	private Rayon rayon;

	@ManyToOne
	private Stock stock;

	@OneToOne(mappedBy="produit")
	private Cart cart;


	@OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.EAGER)
	private List<Advertising> advertisings;

	@OneToMany(cascade = CascadeType.ALL)
	private List<LikeProduct> likeproducts;
	

}
