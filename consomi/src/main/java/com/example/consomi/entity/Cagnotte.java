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
@Table( name = "CAGNOTTE")
public class Cagnotte implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCgnote;

	private int mongton;

	@Temporal(TemporalType.DATE)
	private Date date;
	
	@OneToOne(mappedBy = "cagnotte")
	private Event event;
	
	
	

}
