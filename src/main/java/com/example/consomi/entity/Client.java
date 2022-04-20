package com.example.consomi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "T_CLIENT")
public class Client extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private String name;

	@Column
	private String subName;

	@Column(unique=true)
	private String phoneNumber;

	@Column(unique=true)
	private String address;

	@Column(unique=true)
	private String email;

	@OneToMany(mappedBy = "sender")
	private List<Message> messagesSent;

	@OneToMany(mappedBy = "receiver")
	private List<Message> messagesReceived;

	@OneToMany(mappedBy = "clientp", cascade = CascadeType.REMOVE)
	List<Publication> publications;

	@OneToMany(mappedBy = "client")
	private List<Product> products;

	@OneToMany(mappedBy = "client")
	private List<Comment> comments;

	@OneToMany(mappedBy = "client")
	private List<LikeProduct> likeProducts;
	
	


}
