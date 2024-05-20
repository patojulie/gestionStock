package tech.juliedev.gestionStock.entity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.Instant;

public class Mvtstk extends AbstractEntity{
    @Column(name="dateMvt")
    private Instant dateMvt;

    @Column(name="quantite")
    private int quantite;

    @ManyToOne
    @JoinColumn(name="idArticle")
    private Article article;
}
