package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
public class Client {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    @Column
    private String name;



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
