package com.example.consomi.entity;


import lombok.*;
import org.springframework.stereotype.Component;
import com.example.consomi.enumerated.ReclamationStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Component
@Table(name = "RECLAMATION")
public class Reclamation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idRec;

	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date")
	private Date dateReclamation;

	@Enumerated(EnumType.STRING)
	@Column(name= "etat")
	private ReclamationStatus etatReclamation;
	
	@OneToOne(mappedBy="reclamation")
	private ReponseRec reponseReclamation;

	@OneToOne
	private Delivery livraison;
	
	public Reclamation(int idRec)
	{
		super();
		this.idRec=idRec;
	}
	

}

