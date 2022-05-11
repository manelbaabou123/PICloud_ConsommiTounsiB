package com.example.consomi.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import com.example.consomi.enumerated.DeliveryMenStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "DELIVERY_MEN")
public class DeliveryMen implements Serializable  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idDeliveryMen;

	private String name;
	private String subname;
	
	@Enumerated(EnumType.STRING)
	private DeliveryMenStatus etat;



	@OneToMany(mappedBy="livreur")
	private List<Delivery> livraisons;

	@JsonManagedReference
	public List<Delivery> getLivraisons() {
		return livraisons;
	}

	public void setLivraisons(List<Delivery> livraisons) {
		this.livraisons = livraisons;
	}
}
