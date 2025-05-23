package com.miapp.pruebaJpaCrud.repository;
import com.miapp.pruebaJpaCrud.model.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
