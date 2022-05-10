package tn.esprit.spring.entity;



import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name="Stock")
public class Stock implements Serializable {
public Long getPrix() {
		return prix;
	}


	public void setPrix(Long prix) {
		this.prix = prix;
	}
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="Stock_ID")
private Long SId;
@Column(name="quantity")
private Long quantity;
@Column(name="prixunitaire")
private Long prix;
public Stock() {
	// TODO Auto-generated constructor stub
}


public Stock(Long sId, Long quantity, List<tn.esprit.spring.entity.produit_test> produit_test) {
	
	SId = sId;
	this.quantity = quantity;
	this.produit_test = produit_test;
}


public Stock(Long sId, Long quantity, Long prix) {
	
	SId = sId;
	this.quantity = quantity;
	this.prix = prix;
}


public Stock(Long sId, Long quantity) {
	SId = sId;
	this.quantity = quantity;
	
}

public Long getSId() {
	return SId;
}
public void setSId(Long sId) {
	SId = sId;
}

public Long getQuantity() {
	return quantity;
}


public void setQuantity(Long quantity) {
	this.quantity = quantity;
}


public List<produit_test> getProduit_test() {
	return produit_test;
}
public void setProduit_test(List<produit_test> produit_test) {
	this.produit_test = produit_test;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@OneToMany(cascade = CascadeType.ALL, mappedBy="Stocks")
private List<produit_test> produit_test;
@Override
public String toString() {
	return "Stock [SId=" + SId + ", quantity=" + quantity+"]";
}
}

