package com.example.graphQL.controller;

import com.example.graphQL.entity.Cours;
import com.example.graphQL.service.CoursService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CoursController {

    CoursService coursService;
    //injection de dépendances
    public CoursController(CoursService coursService)
    {
        this.coursService = coursService;
    }

    @QueryMapping
    public Cours coursById(@Argument Long id)
    {
        return coursService.coursById(id);
    }
}
