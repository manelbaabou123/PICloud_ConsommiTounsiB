package com.example.consomi.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "DONATION")
public class Donation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idDonation;

	@Column(name = "nbr_Product")
	private int nbProduct;

	//private User clienNess;
	
	@OneToMany(mappedBy = "donation")
	private List<Product> products;
	
}
