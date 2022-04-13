package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
public class ResponseReclamation {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idRepRec;

    @Column
    @Enumerated(EnumType.STRING)
    private Decision decision;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateReponse;

    @Column
    private String message;

    @OneToOne
    private Reclamation reclamation ;


}
