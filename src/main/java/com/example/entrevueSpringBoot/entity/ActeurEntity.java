package com.example.entrevueSpringBoot.entity;

import javax.persistence.*;

@Entity
@Table(name = "Acteur")
public class ActeurEntity {

    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @Column
    private String nom;

    @Column
    private String prenom;

    public ActeurEntity(String nom, String prenom) {

        this.nom = nom;
        this.prenom = prenom;
    }

    public ActeurEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
