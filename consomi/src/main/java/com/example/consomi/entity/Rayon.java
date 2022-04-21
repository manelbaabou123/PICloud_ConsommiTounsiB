package com.example.consomi.entity;

import com.example.consomi.enumerated.TypesRayon;
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
@Table(name = "RAYON")
public class Rayon implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idRayon;

	@Enumerated(EnumType.STRING)
	private TypesRayon type_rayon ;
	
	@OneToMany(mappedBy="rayon")
	private List<Product> produits;
}
