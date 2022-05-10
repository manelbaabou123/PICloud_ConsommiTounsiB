package tn.esprit.spring.entity;



//import java.sql.Date;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name ="FILES")
public class FileDb {

	@Id
	private String id;
	
	private String name;
	
	private String type;
	private String path;
	
	

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	private String nom_de_demande;
	@Temporal(TemporalType.DATE)
	private Date dateAchat;
	
	public String getNom_de_demande() {
		return nom_de_demande;
	}

	public void setNom_de_demande(String nom_de_demande) {
		this.nom_de_demande = nom_de_demande;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	@Lob
	private byte[] data;
	
	

	public FileDb(String id, String name, String type, byte[] data) {
		
		this.id = id;
		this.name = name;
		this.type = type;
		this.data = data;
	}

	public FileDb(String id, String name, String type, String nom_de_demande, Date dateAchat, byte[] data) {
		
		this.id = id;
		this.name = name;
		this.type = type;
		this.nom_de_demande = nom_de_demande;
		this.dateAchat = dateAchat;
		this.data = data;
	}
	

	public FileDb() {
		
	}

	public FileDb(String id, String name, String type, String path,byte[] data) {
		
		this.id = id;
		this.name = name;
		this.type = type;
		this.path = path;
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public List<produit_test> getProduit_test() {
		return produit_test;
	}
	public void setProduit_test(List<produit_test> produit_test) {
		this.produit_test = produit_test;
	}
	
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="FileDb")
	private List<produit_test> produit_test;
}

