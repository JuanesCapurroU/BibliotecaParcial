package com.example.Parcial.Servicio;

import com.example.Parcial.Modelo.Autor;
import java.util.List;
import java.util.Optional;

public interface AutorServicio {

    Optional<Autor> getAutorById(Long id);

    List<Autor> getAllAutores();

    List<Autor> getAutoresByNacionalidad(String nacionalidad);

    List<Autor> getAutoresByAñoNacimiento(Integer añoNacimiento);

    Autor saveAutor(Autor autor);

    void deleteAutor(Long id);

    void updateAutorNombre(Long id, String nombre);
}
