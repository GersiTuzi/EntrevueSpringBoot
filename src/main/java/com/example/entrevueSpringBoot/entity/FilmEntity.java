package com.example.entrevueSpringBoot.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Film")
public class FilmEntity {
    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private long id;

    @Column
    private String titre;

    @Column
    private String description;

    @Column()
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private List<ActeurEntity> acteurEntities;

    public FilmEntity(long id, String titre, String description, List<ActeurEntity> acteurEntities) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.acteurEntities = acteurEntities;
    }

    public FilmEntity() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ActeurEntity> getActeurs() {
        return acteurEntities;
    }

    public void setActeurs(List<ActeurEntity> acteurEntities) {
        this.acteurEntities = acteurEntities;
    }
}
