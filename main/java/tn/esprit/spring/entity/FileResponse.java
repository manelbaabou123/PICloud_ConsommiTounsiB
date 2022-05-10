package tn.esprit.spring.entity;



import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class FileResponse {

	private String id;

	private String type;

	private String name;
	private String path;
	private String nom_de_demande;
	@Temporal(TemporalType.DATE)
	private Date dateAchat;
	
	
	

	public FileResponse() {

	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}


	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getNom_de_demande() {
		return nom_de_demande;
	}

	public void setNom_de_demande(String nom_de_demande) {
		this.nom_de_demande = nom_de_demande;
	}

	

	public FileResponse(String id, String type, String name) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
public FileResponse(String id, String type, String name, String path, String nom_de_demande, Date dateAchat) {
		
		this.id = id;
		this.type = type;
		this.name = name;
		this.path = path;
		this.nom_de_demande = nom_de_demande;
		this.dateAchat = dateAchat;
	}
	public FileResponse(String id, String type, String name, String nom_de_demande, Date dateAchat) {
		
		this.id = id;
		this.type = type;
		this.name = name;
		this.nom_de_demande = nom_de_demande;
		this.dateAchat = dateAchat;
	}
	public FileResponse(String id, String type, String name, String nom_de_demande) {
		
		this.id = id;
		this.type = type;
		this.name = name;
		this.nom_de_demande = nom_de_demande;
		
	}

}
