package com.example.consomi.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import com.example.consomi.enumerated.DeliveryManStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "T_DELIVERY_MAN")
public class DeliveryMan implements Serializable  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idDeliveryMan;

	private String name;
	private String subname;
	
	@Enumerated(EnumType.STRING)
	private DeliveryManStatus etat;



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
