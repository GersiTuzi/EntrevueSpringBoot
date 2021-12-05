package com.example.entrevueSpringBoot.controller;

import com.example.entrevueSpringBoot.entity.FilmEntity;
import com.example.entrevueSpringBoot.model.FilmModel;
import com.example.entrevueSpringBoot.mapper.FilmMapper;
import com.example.entrevueSpringBoot.repo.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/film")
public class FilmController {

    private FilmRepository repository;


    @Autowired
    public FilmController(FilmRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public  ResponseEntity<FilmEntity> getFilmById(@PathVariable("id") Long id) {

        try{
            return new ResponseEntity<>(repository.findById(id).get(),HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<FilmEntity> createFilm(@RequestBody FilmModel filmModel) {
        FilmMapper filmMapper = new FilmMapper();
        FilmEntity filmEntity = filmMapper.filmModelToFilm(filmModel);

        try{
            repository.saveAndFlush(filmEntity);
            return new ResponseEntity<>(filmEntity,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
