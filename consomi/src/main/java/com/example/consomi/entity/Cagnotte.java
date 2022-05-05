package com.example.consomi.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Cagnotte implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCgnote;

	private int montant;

	@Temporal(TemporalType.DATE)
	private Date date;

	@ManyToOne
	private Event event;

	@ManyToOne
	private User client ;
	
	
	

}
