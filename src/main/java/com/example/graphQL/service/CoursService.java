package com.example.graphQL.service;

import com.example.graphQL.entity.Cours;
import com.example.graphQL.repository.CoursRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoursService {

    CoursRepository coursRepository;
    //injection de dépendance
    public CoursService(CoursRepository coursRepository)
    {
        this.coursRepository = coursRepository;
    }
    //retourne un Cours
    public Cours coursById(Long id)
    {
        Optional<Cours> cours = coursRepository.findById(id);
        return cours.orElse(null);
    }
}
