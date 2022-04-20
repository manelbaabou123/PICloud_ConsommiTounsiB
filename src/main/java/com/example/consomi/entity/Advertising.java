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
@Table( name = "T_ADVERTISING")
public class Advertising implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAd;
	
	@Column(name = "channel")
	private String channelAd;
	
	@Column(name = "dateBegin")
	@Temporal(TemporalType.DATE)
	private Date dateBeginAd;
	
	@Column(name = "dateEnd")
	@Temporal(TemporalType.DATE)
	private Date dateEndAd;
	
	@Column(name = "viewsInit")
	private int nbrInitViewsAd;
	
	@Column(name = "finalViewsNumber")
	private int nbrFinalViewsAd;
	
	@Column(name = "priceDay")
	private float priceAdPerDay;
	
	@Column(name = "priceView")
	private float priceAdPerView;
	
	@ManyToOne
	private Product product;
}
