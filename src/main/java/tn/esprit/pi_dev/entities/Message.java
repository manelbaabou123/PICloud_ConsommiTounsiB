package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
public class Message {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMessage;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String content;

    @ManyToOne
    private Client sender;

    @ManyToOne
    private Client receiver;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

}
