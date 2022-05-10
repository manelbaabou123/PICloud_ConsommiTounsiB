package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;












import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Produit")
public class produit_test implements Serializable {

public Long getPId() {
		return PId;
	}
	public void setPId(Long pId) {
		PId = pId;
	}
	public String getProduit_name() {
		return Produit_name;
	}
	public void setProduit_name(String produit_name) {
		Produit_name = produit_name;
	}
	public Stock getStocks() {
		return Stocks;
	}
	public void setStocks(Stock stocks) {
		Stocks = stocks;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="produit_ID")
private Long PId;
@Column(name="Produit_name")
private String Produit_name;
@ManyToOne
Stock Stocks;
@ManyToOne
ray ray;
@ManyToOne
FileDb FileDb;

}

