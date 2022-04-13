package tn.esprit.pi_dev.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
public class Publication {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPub;

    private String title;

    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateCreation;

    @OneToMany(mappedBy = "pub", fetch = FetchType.EAGER)
    private List<RatingPub> ratPub;

    @ManyToOne
    private Client clientp;

}
