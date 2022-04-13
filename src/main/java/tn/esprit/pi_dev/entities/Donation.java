package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
public class Donation {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idDonation;

    @Column
    private int nbProduct;

    @OneToMany
    private List<Product> productsDonated;

}
