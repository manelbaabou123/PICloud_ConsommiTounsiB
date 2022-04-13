package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
public class Reclamation {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idRec;


    @OneToOne
    private Delivery livraison;

    @Column
    private String description;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReclamation;

    @Column
    @Enumerated(EnumType.STRING)
    private ReclamationStatus etatReclamation;

    @OneToOne(mappedBy="reclamation")
    private ResponseReclamation reponseReclamation;

}
