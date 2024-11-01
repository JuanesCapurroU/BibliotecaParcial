package com.example.Parcial.Repositorio;

import com.example.Parcial.Modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {

    // Buscar libros por título
    @Query("SELECT l FROM Libro l WHERE l.titulo LIKE %:titulo%")
    List<Libro> findByTitulo(@Param("titulo") String titulo);

    // Buscar libros por autor
    @Query("SELECT l FROM Libro l WHERE l.autor.idAutor = :idAutor")
    List<Libro> findByAutorId(@Param("idAutor") Long idAutor);

    // Buscar libros por género
    @Query("SELECT l FROM Libro l WHERE l.genero.idGenero = :idGenero")
    List<Libro> findByGeneroId(@Param("idGenero") Long idGenero);

    // Buscar libros disponibles
    @Query("SELECT l FROM Libro l WHERE l.disponibilidad = true")
    List<Libro> findLibrosDisponibles();
}
