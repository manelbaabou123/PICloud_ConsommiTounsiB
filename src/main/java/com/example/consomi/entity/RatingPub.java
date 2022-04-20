package com.example.consomi.entity;

import lombok.*;
import com.example.consomi.enumerated.ratPub;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "T_RATING_PUB")
public class RatingPub implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRp;
	
	@Column
	@Enumerated(EnumType.STRING)
	private ratPub rat;

	@ManyToOne
	private Publication pub;




}
