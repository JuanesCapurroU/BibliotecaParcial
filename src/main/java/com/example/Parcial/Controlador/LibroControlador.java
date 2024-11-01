package com.example.Parcial.Controlador;

import com.example.Parcial.Modelo.Libro;
import com.example.Parcial.Servicio.LibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class LibroControlador {

    @Autowired
    private LibroServicio libroServicio;

    // Obtener un Libro por su ID
    @GetMapping("/{id}")
    public Optional<Libro> getLibroById(@PathVariable Long id) {
        return libroServicio.getLibroById(id);
    }

    // Obtener todos los Libros
    @GetMapping("/todos")
    public List<Libro> getAllLibros() {
        return libroServicio.getAllLibros();
    }

    // Crear un Libro
    @PostMapping("/guardar")
    public ResponseEntity<String> saveLibro(@RequestBody Libro libro) {
        Libro savedLibro = libroServicio.saveLibro(libro);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Libro registrado con éxito. ID: " + savedLibro.getClass());
    }

    // Actualizar título del Libro por ID
    @PutMapping("/{id}/actualizarTitulo")
    public void updateLibroTitulo(@PathVariable Long id, @RequestParam String titulo) {
        libroServicio.updateLibroTitulo(id, titulo);
    }

    // Eliminar Libro por ID
    @DeleteMapping("/eliminar/{id}")
    public void deleteLibro(@PathVariable Long id) {
        libroServicio.deleteLibro(id);
    }
}
