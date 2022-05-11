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
@Table( name = "ADVERTISING")
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
	
	@Column(name = "date_Begin")
	@Temporal(TemporalType.DATE)
	private Date dateBeginAd;
	
	@Column(name = "date_End")
	@Temporal(TemporalType.DATE)
	private Date dateEndAd;
	
	@Column(name = "views_Init")
	private int nbrInitViewsAd;
	
	@Column(name = "final_Views_Number")
	private int nbrFinalViewsAd;
	
	@Column(name = "price_Day")
	private float priceAdPerDay;
	
	@Column(name = "price_View")
	private float priceAdPerView;
	
	@ManyToOne
	@JoinColumn(name="idProduct")
	private Product product;
}
