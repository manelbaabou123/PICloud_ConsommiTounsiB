package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
public class DeliveryMan {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idDeliveryMan;

    @OneToMany(mappedBy="livreur")
    private List<Delivery> livraisons;

    @Enumerated(EnumType.STRING)
    private DeliveryManStatus etat;
}
