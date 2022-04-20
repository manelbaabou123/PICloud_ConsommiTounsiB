package com.example.consomi.entity;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "T_COMMENT")
public class Comment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private int idComment;
	@NotEmpty(message = "Please provide a description for your Comment")
	private String description;

	@ManyToOne
	private Client client;

	@OneToMany(mappedBy = "comment")
	private List<RatingComment> ratingcomment;

}
