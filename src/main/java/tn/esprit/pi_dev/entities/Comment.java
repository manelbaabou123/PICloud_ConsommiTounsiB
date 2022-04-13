package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Setter
@Getter
public class Comment {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idComment;
    private String description;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "comment")
    private List<RatingComment> ratingcomment;

}
