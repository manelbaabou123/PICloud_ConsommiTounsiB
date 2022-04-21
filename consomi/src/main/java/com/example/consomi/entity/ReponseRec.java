package com.example.consomi.entity;


import lombok.*;
import org.springframework.stereotype.Component;
import com.example.consomi.enumerated.Decision;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//@Component
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "REPONSE_REC")
public class ReponseRec implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idRepRec;

	@Enumerated(EnumType.STRING)
	private Decision decision;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date")
	private Date dateReponse;

	private String message;

	@OneToOne
	private Reclamation reclamation ;
	
	

}
