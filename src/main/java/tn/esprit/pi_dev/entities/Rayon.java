package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
public class Rayon {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idRayon;
    @Column
    @Enumerated(EnumType.STRING)
    private TypesRayon type_rayon ;

    @OneToMany(mappedBy="rayon")
    private List<Product> produits;

}
