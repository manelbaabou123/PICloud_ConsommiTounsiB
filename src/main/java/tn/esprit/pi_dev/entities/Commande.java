package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
public class Commande {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idCommande;

    @Column
    private float total;


    @Enumerated(EnumType.STRING)
    private OrderStatus etat;


    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOrder;


    @OneToMany(mappedBy="commande")
    private List<Cart> carts;

    @OneToOne
    private Delivery livraison;

}
