package com.example.graphQL.controller;

import com.example.graphQL.entity.Enseignant;
import com.example.graphQL.service.EnseignantService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class EnseignantController {
    //injection de dépendance
    EnseignantService enseignantService;
    public EnseignantController(EnseignantService enseignantService)
    {
        this.enseignantService = enseignantService;
    }

    @QueryMapping
    public Enseignant enseignantById(Long id)
    {
        return enseignantService.EnseignantById(id);
    }
}
