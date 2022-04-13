package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Getter
@Setter
public class LikeProduct {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idLike;

    @Enumerated(EnumType.STRING)
    private LikedProduct nameLike;

    @Column
    private int nbrview;

//	@ManyToOne
//	@JoinColumn(name = "fkIdProduct")
//	private Product product;

    @ManyToOne
    private Client client;
}
