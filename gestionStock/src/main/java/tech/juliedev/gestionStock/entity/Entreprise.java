package tech.juliedev.gestionStock.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="entreprise")
public class Entreprise extends AbstractEntity{
    @Column(name="nom")
    private String nom;

    @Column(name="description")
    private String description;

    @Column(name="adresse")
    private String adresse;

    @Column(name="codeFiscale")
    private String codeFiscale;

    @Column(name="photo")
    private String photo;

    @Column(name="email")
    private String email;

    @Column(name="numTel")
    private String numTel;

    @Column(name="siteWeb")
    private String siteWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<Users> listUsers;

    @OneToMany(mappedBy = "entreprise")
    private List<Article> listArticle;
}
