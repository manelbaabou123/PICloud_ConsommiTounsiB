package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
public class Delivery {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idDelivery;

    @Column
    private float cout;

    @ManyToOne
    private DeliveryMan livreur;


    @OneToOne
    private Commande commande;

    @OneToOne(mappedBy = "livraison")
    private Reclamation reclamation;


    @Enumerated(EnumType.STRING)
    private DeliveryStatus etat;

    @Temporal(TemporalType.TIMESTAMP)
    private Date DeliveryDate;



    @OneToOne
    private Facture facture;

}
