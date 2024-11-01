package com.example.Parcial.Servicio;

import com.example.Parcial.Modelo.Genero;
import java.util.List;
import java.util.Optional;

public interface GeneroServicio {
    Optional<Genero> getGeneroById(Long id);
    List<Genero> getAllGeneros();
    Optional<Genero> getGeneroByNombre(String nombreGenero);
    Genero saveGenero(Genero genero);
    void deleteGenero(Long id);

    void updateGeneroNombre(Long id, String nombreGenero);
}
