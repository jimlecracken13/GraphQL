package com.example.graphQL.service;

import com.example.graphQL.entity.Cours;
import com.example.graphQL.entity.Enseignant;
import com.example.graphQL.repository.EnseignantRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnseignantService {
    //injection de dépendance
    EnseignantRepository enseignantRepository;
    public EnseignantService(EnseignantRepository enseignantRepository)
    {
        this.enseignantRepository = enseignantRepository;
    }
    public Enseignant EnseignantById(Long id)
    {
        Optional<Enseignant> enseignant = enseignantRepository.findById(id);
        return enseignant.orElse(null);
    }
}
