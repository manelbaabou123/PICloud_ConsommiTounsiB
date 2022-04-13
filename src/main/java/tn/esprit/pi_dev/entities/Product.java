package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
public class Product {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idProduct;

    private String nameProduct;

    private String descriptionProduct;

    private float priceProduct;

    @Temporal(TemporalType.DATE)
    private Date dateCreationProduct;

    @Temporal(TemporalType.DATE)
    private Date dateEndNewProduct;

    private String imageFileNameProduct;

    private String barcodeProduct;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Rayon rayon;

    @ManyToOne
    private Stock stock;

    @OneToOne(mappedBy="produit")
    private Cart cart;


    @OneToMany(mappedBy = "product", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.EAGER)
    private List<Advertising> advertisings;

    @OneToMany(cascade = CascadeType.ALL)
    private List<LikeProduct> likeproducts;

}
