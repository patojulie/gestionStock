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
@Table(name="orderSuppliers")
public class OrdersSuppliers extends AbstractEntity{
    @Column(name="code")
    private String code;

    @Column(name="dateCammande")
    private Instant dateCommande;


    @ManyToOne
    @JoinColumn(name="idSupplier")
    private Suppliers suppliers;

    @OneToMany(mappedBy = "ordersSuppliers")
    private List<LineSuppliers> listDesCommandesFournisseurs;
}
