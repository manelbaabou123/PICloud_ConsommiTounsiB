package com.example.consomi.entity;


import lombok.*;
import com.example.consomi.enumerated.LikedProduct;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "T_LIKE_PROD")
public class LikeProduct implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLike;
	
	@Column(name = "name")
	@Enumerated(EnumType.STRING)
	private LikedProduct nameLike;
	
	@Column
	private int nbrview;
	
	@ManyToOne
	private Client client;
	
}
