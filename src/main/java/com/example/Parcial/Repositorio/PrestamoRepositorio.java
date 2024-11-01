package com.example.Parcial.Repositorio;

import com.example.Parcial.Modelo.Cliente;
import com.example.Parcial.Modelo.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Date;

public interface PrestamoRepositorio extends JpaRepository<Prestamo, Long> {

    // Buscar préstamos por fecha de préstamo
    @Query("SELECT p FROM Prestamo p WHERE p.fechaPrestamo = :fechaPrestamo")
    List<Prestamo> findByFechaPrestamo(@Param("fechaPrestamo") Date fechaPrestamo);

    // Buscar préstamos activos (sin fecha de devolución)
    @Query("SELECT p FROM Prestamo p WHERE p.fechaDevolucion IS NULL")
    List<Prestamo> findPrestamosActivos();

    // Buscar préstamos de un cliente
    @Query("SELECT p FROM Prestamo p WHERE p.cliente.idCliente = :idCliente")
    List<Prestamo> findByClienteId(@Param("idCliente") Long idCliente);

    @Query("SELECT p.cliente FROM Prestamo p WHERE p.libro.titulo = :tituloLibro")
    List<Cliente> findClientesByLibroTitulo(@Param("tituloLibro") String tituloLibro);
}
