package com.example.Parcial.Servicio;

import com.example.Parcial.Modelo.Libro;
import com.example.Parcial.Repositorio.LibroRepositorio;
import com.example.Parcial.Servicio.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroServicioImpl implements LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Override
    public Optional<Libro> getLibroById(Long id) {
        return libroRepositorio.findById(id);
    }

    @Override
    public List<Libro> getAllLibros() {
        return libroRepositorio.findAll();
    }

    @Override
    public List<Libro> getLibrosByTitulo(String titulo) {
        return libroRepositorio.findByTitulo(titulo);
    }

    @Override
    public List<Libro> getLibrosByAutorId(Long idAutor) {
        return libroRepositorio.findByAutorId(idAutor);
    }

    @Override
    public List<Libro> getLibrosByGeneroId(Long idGenero) {
        return libroRepositorio.findByGeneroId(idGenero);
    }

    @Override
    public List<Libro> getLibrosDisponibles() {
        return libroRepositorio.findLibrosDisponibles();
    }

    @Override
    public Libro saveLibro(Libro libro) {
        return libroRepositorio.save(libro);
    }

    @Override
    public void deleteLibro(Long id) {
        libroRepositorio.deleteById(id);
    }

    @Override
    public void updateLibroTitulo(Long id, String titulo) {

    }
}
