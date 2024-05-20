package tech.juliedev.gestionStock.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="users")
public class Users extends AbstractEntity{
    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="email")
    private String email;

    @Column(name="dateNaiss")
    private Instant dateNaiss;

    @Column(name="password")
    private String password;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name="idEntreprise")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "users")
    private List<Role> listRole;


}
