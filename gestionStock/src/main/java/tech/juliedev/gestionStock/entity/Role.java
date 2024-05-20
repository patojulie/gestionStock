package tech.juliedev.gestionStock.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="role")
public class Role extends AbstractEntity{
    @Column(name="nom")
    private String nom;

    @ManyToOne
    @JoinColumn(name="idUser")
    private Users users;
}
