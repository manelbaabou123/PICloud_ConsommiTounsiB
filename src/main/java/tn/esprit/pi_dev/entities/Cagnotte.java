package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Cagnotte {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)


    private int idCgnote;

    private int mongton;

    private Date date;

    @OneToMany(mappedBy = "cagnotte")
    private List<Event> events;

    @ManyToMany(mappedBy = "cagnottes")
    private List<Client> clients;

}
