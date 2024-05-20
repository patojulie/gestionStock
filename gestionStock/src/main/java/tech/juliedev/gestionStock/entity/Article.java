package tech.juliedev.gestionStock.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="article")
public class Article extends AbstractEntity{
    @Column(name="codeArtcile")
    private String codeArticle;

    @Column(name="designation")
    private String designation;

    @Column(name="prixUnitaireht")
    private BigDecimal prixUnitaireht;

    @Column(name="tauxTva")
    private BigDecimal tauxTva;

    @Column(name="prixUnitairettc")
    private BigDecimal prixUnitairettc;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name="idCategory")
    private Category category;

    @ManyToOne
    @JoinColumn(name="IdEntreprise")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "article")
    private List<LineOrders> listCommande;

    @OneToMany(mappedBy = "article")
    private List<LineSale> listVente;

    @OneToMany(mappedBy = "article")
    private List<Mvtstk> listMvtstk;

    @OneToMany(mappedBy = "article")
    private List<LineSuppliers> listFournisseurs;




}
