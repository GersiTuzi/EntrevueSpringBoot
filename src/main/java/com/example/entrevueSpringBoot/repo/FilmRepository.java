package com.example.entrevueSpringBoot.repo;

import com.example.entrevueSpringBoot.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<FilmEntity, Long> {

}
