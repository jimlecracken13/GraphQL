package com.example.graphQL.repository;


import com.example.graphQL.entity.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
}
