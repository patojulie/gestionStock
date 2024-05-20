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
@Table(name="orders")
public class Orders extends AbstractEntity{
    @Column(name="code")
    private String code;

    @Column(name="dateCammande")
    private Instant dateCommande;

    @OneToMany(mappedBy = "order")
    private List<LineOrders> listDesLigneCommandes;

    @ManyToOne
    @JoinColumn(name="idClient")
    private Client client;


}
