package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
public class Event {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Admin fondateur;

    @ManyToOne
    private  Cagnotte cagnotte;

    @Column
    private float cout;


    @Temporal(TemporalType.DATE)
    private Date dateEvent;

    @Column
    private String titre;

    @Column
    private String description;




}
