package com.example.entrevueSpringBoot.mapper;

import com.example.entrevueSpringBoot.entity.ActeurEntity;
import com.example.entrevueSpringBoot.entity.FilmEntity;
import com.example.entrevueSpringBoot.model.FilmModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class FilmMapper {

    public FilmMapper() {
    }

    public FilmEntity filmModelToFilmEntity(FilmModel model){

        FilmEntity film = new FilmEntity();
        film.setDescription(model.getDescription());
        film.setTitre(model.getTitre());
        film.setActeurs(getActeurs(model));
        return film;
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
