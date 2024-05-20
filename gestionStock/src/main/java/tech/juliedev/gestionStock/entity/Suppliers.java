package tech.juliedev.gestionStock.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="suppliers")
public class Suppliers extends AbstractEntity{
    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="photo")
    private String photo;

    @Column(name="mail")
    private String mail;

    @Column(name="numTel")
    private String numTel;

    @OneToMany(mappedBy = "suppliers")
    private List<OrdersSuppliers> listDesCommandes;

}
