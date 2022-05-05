package com.example.consomi.entity;

import com.example.consomi.enumerated.Role;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idUser;

	private String username;
	private String email;
	private String phoneNumber;
	private String address;
	private String password;
	private String confirmPassword;

	@Enumerated(EnumType.STRING)
	private Role role;


	@OneToMany(mappedBy="client")
	private List<Product> produits;

	@OneToMany
	private List<Event> event ;
	@OneToMany (cascade = CascadeType.ALL,mappedBy = "client")
	private List<Cagnotte> cagnotte ;

	@OneToMany(mappedBy="client")
	private List<Comment> comments;

	@OneToMany(mappedBy="client")
	private List<Publication> publications;

	@OneToMany(mappedBy="sender")
	private List<Message> MessagesSender;

	@OneToMany(mappedBy="receiver")
	private List<Message> MessagesReceiver;



	
}