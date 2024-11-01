package com.example.Parcial.Servicio;

import com.example.Parcial.Modelo.Genero;
import com.example.Parcial.Repositorio.GeneroRepositorio;
import com.example.Parcial.Servicio.GeneroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeneroServicioImpl implements GeneroServicio {

    @Autowired
    private GeneroRepositorio generoRepositorio;

    @Override
    public Optional<Genero> getGeneroById(Long id) {
        return generoRepositorio.findById(id);
    }

    @Override
    public List<Genero> getAllGeneros() {
        return generoRepositorio.findAll();
    }

    @Override
    public Optional<Genero> getGeneroByNombre(String nombreGenero) {
        return generoRepositorio.findByNombreGenero(nombreGenero);
    }

    @Override
    public Genero saveGenero(Genero genero) {
        return generoRepositorio.save(genero);
    }

    @Override
    public void deleteGenero(Long id) {
        generoRepositorio.deleteById(id);
    }

    @Override
    public void updateGeneroNombre(Long id, String nombreGenero) {

    }
}
