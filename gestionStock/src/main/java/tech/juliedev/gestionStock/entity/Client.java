package tech.juliedev.gestionStock.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.Order;
import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="client")
public class Client extends AbstractEntity{
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

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "client")
    private List<Order> listCommandes;

}
