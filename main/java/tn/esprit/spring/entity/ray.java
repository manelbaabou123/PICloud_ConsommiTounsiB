package tn.esprit.spring.entity;


	import java.io.Serializable;
    import java.util.Set;
    import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
	import javax.persistence.Table;

	@Entity
	@Table(name="ray")
	public class ray implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="ray_ID")
	private Long RAy_ID;
	@Column(name="Ray_Name")
	private String Ray_Name;
	@Enumerated(EnumType.STRING)
	private RayonTyp rayontype;
	
	public ray() {
		// TODO Auto-generated constructor stub
	}

	public ray(Long rAy_ID, String ray_Name) {
		
		RAy_ID = rAy_ID;
		Ray_Name = ray_Name;
		
	}
	public Long getRAy_ID() {
		return RAy_ID;
	}
	public void setRAy_ID(Long rAy_ID) {
		RAy_ID = rAy_ID;
	}
	public String getRay_Name() {
		return Ray_Name;
	}
	
	public void setRay_Name(String ray_Name) {
		Ray_Name = ray_Name;
	}
	public List<produit_test> getProduit_test() {
		return produit_test;
	}
	public void setProduit_test(List<produit_test> produit_test) {
		this.produit_test = produit_test;
	}
	
	
	
	@Override
	public String toString() {
		return "ray [RAy_ID=" + RAy_ID + ", Ray_Name=" + Ray_Name + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="ray")
	private List<produit_test> produit_test;
	
	}



