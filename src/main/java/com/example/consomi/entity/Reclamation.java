package com.example.consomi.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
import com.example.consomi.enumerated.ReclamationStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Component
@Table(name = "T_RECLAMATION")
public class Reclamation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idRec;
	
	@Column
	private String description;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateReclamation;
	
	@Column
	@Enumerated(EnumType.STRING)
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

