package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
public class Admin {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdmin;

    @OneToMany
    private List<Product> products;

    @OneToMany(mappedBy = "fondateur", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch=FetchType.EAGER)
    private List<Event> events;

    @OneToMany
    private List<DeliveryMan> livreurs;


}
