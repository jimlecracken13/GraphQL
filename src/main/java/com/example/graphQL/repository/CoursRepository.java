package com.example.graphQL.repository;

import com.example.graphQL.entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<Cours, Long> {
}
