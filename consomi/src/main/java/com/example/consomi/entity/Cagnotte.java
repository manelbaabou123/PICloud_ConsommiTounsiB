package com.example.consomi.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Cagnotte implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCgnote;

	private int montant;

	@Temporal(TemporalType.DATE)
	private Date date;

	@OneToOne(mappedBy = "cagnotte")
	private Event event;

	@ManyToMany
	private List<User>  clients ;

	/*@ManyToMany
	@JoinTable(name = "cagnotte_participants",
			joinColumns = @JoinColumn(name = "cagnotte_id"),
			inverseJoinColumns = @JoinColumn(name = "users_id"))
	private List<User> users = new ArrayList<>();
	*/
	

}
