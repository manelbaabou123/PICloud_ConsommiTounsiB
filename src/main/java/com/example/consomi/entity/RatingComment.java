package com.example.consomi.entity;


import lombok.*;
import com.example.consomi.enumerated.TypeRating;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "T_RATING_COMMENT")
public class RatingComment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRating;
	@Column
	@Enumerated(EnumType.STRING)
	private TypeRating typerating;

	@ManyToOne
	private Comment comment;

}
