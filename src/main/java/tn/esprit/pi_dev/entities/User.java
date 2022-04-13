package tn.esprit.pi_dev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idUser;

    private String username;

    private String password;
    private String confirmPassword;
    private String phoneNumber;
    private String address;

    private String email;


}
