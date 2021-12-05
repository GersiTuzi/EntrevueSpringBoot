package com.example.entrevueSpringBoot.mapper;

import com.example.entrevueSpringBoot.entity.ActeurEntity;
import com.example.entrevueSpringBoot.entity.FilmEntity;
import com.example.entrevueSpringBoot.model.FilmModel;

import java.util.ArrayList;
import java.util.List;

public class FilmMapper {

    public FilmMapper() {
    }

    public FilmEntity filmModelToFilm(FilmModel model){

        FilmEntity filmEntity = new FilmEntity();
        filmEntity.setDescription(model.getDescription());
        filmEntity.setTitre(model.getTitre());
        filmEntity.setActeurs(getActeurs(model));
        return filmEntity;
    }

    private List<ActeurEntity> getActeurs(FilmModel model) {

        List<ActeurEntity> acteurEntities = new ArrayList<>();

        for(int i=0; i<model.getActeurs().size();i++){
            acteurEntities.add(new ActeurEntity(model.getActeurs().get(i).getNom(),
                    model.getActeurs().get(i).getPrenom()));
        }
        return acteurEntities;
    }
}
