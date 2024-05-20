package tech.juliedev.gestionStock.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="lineOrders")
public class LineOrders extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="idArticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name="idOrder")
    private Orders orders;
}
