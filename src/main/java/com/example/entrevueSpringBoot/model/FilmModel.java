package com.example.entrevueSpringBoot.model;

import java.util.List;

public class FilmModel {
    private String titre;
    private String description;
    private List<ActeurModel> acteurs;

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

    public List<ActeurModel> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<ActeurModel> acteurs) {
        this.acteurs = acteurs;
    }

    public FilmModel() {
    }

}
