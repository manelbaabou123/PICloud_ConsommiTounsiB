package com.example.consomi.entity;

import com.example.consomi.enumerated.TypesRayon;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "T_RAYON")
public class Rayon implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idRayon;
	@Column
	@Enumerated(EnumType.STRING)
	private TypesRayon type_rayon ;
	
	@OneToMany(mappedBy="rayon")
	private List<Product> produits;
}
