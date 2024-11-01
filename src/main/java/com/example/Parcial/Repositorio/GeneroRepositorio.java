package com.example.Parcial.Repositorio;

import com.example.Parcial.Modelo.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface GeneroRepositorio extends JpaRepository<Genero, Long> {

    // Buscar género por nombre
    @Query("SELECT g FROM Genero g WHERE g.nombreGenero = :nombreGenero")
    Optional<Genero> findByNombreGenero(@Param("nombreGenero") String nombreGenero);
}
