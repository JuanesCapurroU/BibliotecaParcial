package com.example.Parcial.Controlador;

import com.example.Parcial.Modelo.Genero;
import com.example.Parcial.Servicio.GeneroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class GeneroControlador {

    @Autowired
    private GeneroServicio generoServicio;

    // Obtener un Género por su ID
    @GetMapping("/{id}")
    public Optional<Genero> getGeneroById(@PathVariable Long id) {
        return generoServicio.getGeneroById(id);
    }

    // Obtener todos los Géneros
    @GetMapping("/todos")
    public List<Genero> getAllGeneros() {
        return generoServicio.getAllGeneros();
    }

    // Crear un Género
    @PostMapping("/guardar")
    public ResponseEntity<String> saveGenero(@RequestBody Genero genero) {
        Genero savedGenero = generoServicio.saveGenero(genero);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Género registrado con éxito. ID: " + savedGenero.getIdGenero());
    }

    // Actualizar nombre del Género por ID
    @PutMapping("/{id}/actualizarNombre")
    public ResponseEntity<String> updateGeneroNombre(@PathVariable Long id, @RequestParam String nombreGenero) {
        generoServicio.updateGeneroNombre(id, nombreGenero);
        return ResponseEntity.ok("Nombre del género actualizado con éxito.");
    }

    // Eliminar Género por ID
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> deleteGenero(@PathVariable Long id) {
        generoServicio.deleteGenero(id);
        return ResponseEntity.ok("Género eliminado con éxito.");
    }
}