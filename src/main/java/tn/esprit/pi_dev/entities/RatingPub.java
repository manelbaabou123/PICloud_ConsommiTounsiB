package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
public class RatingPub {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRp;

    @Column
    @Enumerated(EnumType.STRING)
    private ratPub rat;

    @ManyToOne
    private Publication pub;

}
