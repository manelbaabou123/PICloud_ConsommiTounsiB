package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
public class Stock {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idStock;

    @OneToMany(mappedBy="stock")
    private List<Product> produits;

    @Column
    private float quantite;

    @Column
    private float prixAchat;

    @Column
    private float prixVente;

    @Column
    private float quantiteVendu;

    @Column
    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    @Column
    @Enumerated(EnumType.STRING)
    private StockStatus etat;

}
