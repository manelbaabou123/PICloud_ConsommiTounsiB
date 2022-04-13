package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
public class Cart {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idCart;


    @ManyToOne
    private Commande commande;


    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @OneToOne
    private Product produit;



    @Column
    private int quantite;
    @Column
    private float total;


}
