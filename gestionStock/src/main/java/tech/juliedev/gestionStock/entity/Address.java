package tech.juliedev.gestionStock.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="address")
public class Address extends AbstractEntity{
    @Column(name="adress1")
    private String adress1;

    @Column(name="adress2")
    private String adress2;

    @Column(name="ville")
    private String ville;

    @Column(name="codePostal")
    private String codePostal;

    @Column(name="pays")
    private String pays;
}
