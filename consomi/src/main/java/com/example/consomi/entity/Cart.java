package com.example.consomi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "carts")
public class Cart {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long idCart;
		
		@Column(name ="quantite")
		private int quantite;
		
		@Column(name ="total")
		private float total;
		
		@Temporal(TemporalType.DATE)
		@Column(name = "date_Creation")
		private Date dateCreation;

		
		
		
		
		public Cart() {
			super();
			
		}

		public Cart(int quantite, float total, Date dateCreation) {
			super();
			this.quantite = quantite;
			this.total = total;
			this.dateCreation = dateCreation;
		}

		public long getIdCart() {
			return idCart;
		}

		public void setIdCart(long idCart) {
			this.idCart = idCart;
		}

		public int getQuantite() {
			return quantite;
		}

		public void setQuantite(int quantite) {
			this.quantite = quantite;
		}

		public float getTotal() {
			return total;
		}

		public void setTotal(float total) {
			this.total = total;
		}

		public Date getDateCreation() {
			return dateCreation;
		}

		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}


}

