package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
public class RatingComment {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRating;
    @Column
    @Enumerated(EnumType.STRING)
    private TypeRating typerating;

    @ManyToOne
    private Comment comment;

}
