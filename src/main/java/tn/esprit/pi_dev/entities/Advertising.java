package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Entity
@Getter
@Setter
public class Advertising {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idAd;

    private String channelAd;

//	@Column(name = "sponsorType")
//	@Enumerated(EnumType.STRING)
//	private SponsorType sponsorType;

    @Temporal(TemporalType.DATE)
    private Date dateBeginAd;

    @Temporal(TemporalType.DATE)
    private Date dateEndAd;

    private int nbrInitViewsAd;

    private int nbrFinalViewsAd;

    private float priceAdPerDay;

    private float priceAdPerView;

    @ManyToOne
    private Product product;
}
