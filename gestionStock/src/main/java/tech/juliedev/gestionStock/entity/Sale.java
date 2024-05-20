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
@Table(name="sale")
public class Sale extends AbstractEntity{
    @Column(name="code")
    private String code;

    @Column(name="dateVente")
    private Instant dateVente;

    @Column(name="commentaire")
    private String commentaire;

    @OneToMany(mappedBy = "sale")
    private List<LineSale> listVente;

}
