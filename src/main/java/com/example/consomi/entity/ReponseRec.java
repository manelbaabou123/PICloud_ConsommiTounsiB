package com.example.consomi.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
import com.example.consomi.enumerated.Decision;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Component
@Entity
@Getter
@Setter
@ToString
@Table(name = "T_REPONSE_REC")
public class ReponseRec implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idRepRec;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Decision decision;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateReponse;
	
	@Column
	private String message;
	
	@OneToOne
	private Reclamation reclamation ;
	
	

}
