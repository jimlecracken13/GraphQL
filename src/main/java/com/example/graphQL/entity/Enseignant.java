package com.example.graphQL.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Enseignant {
    @Id
    private Long id;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "enseignant")
    List<Cours> coursEnseigne;
}
