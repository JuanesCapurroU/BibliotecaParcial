package com.example.Parcial.Servicio;

import com.example.Parcial.Modelo.Libro;
import java.util.List;
import java.util.Optional;

public interface LibroServicio {

    Optional<Libro> getLibroById(Long id);

    List<Libro> getAllLibros();

    List<Libro> getLibrosByTitulo(String titulo);

    List<Libro> getLibrosByAutorId(Long idAutor);

    List<Libro> getLibrosByGeneroId(Long idGenero);

    List<Libro> getLibrosDisponibles();

    Libro saveLibro(Libro libro);

    void deleteLibro(Long id);

    void updateLibroTitulo(Long id, String titulo);
}
