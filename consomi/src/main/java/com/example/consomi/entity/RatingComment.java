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
@Table(name = "RATING_COMMENT")
public class RatingComment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRating;

	@Enumerated(EnumType.STRING)
	@Column(name = "type")
	private TypeRating typerating;

	@ManyToOne
	@JoinColumn(name = "idComment")
	private Comment comment;

}
