package com.example.Parcial.Servicio;

import com.example.Parcial.Modelo.Cliente;
import com.example.Parcial.Modelo.Prestamo;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PrestamoServicio {

    Optional<Prestamo> getPrestamoById(Long id);

    List<Prestamo> getAllPrestamos();

    List<Prestamo> getPrestamosByFechaPrestamo(Date fechaPrestamo);

    List<Prestamo> getPrestamosActivos();

    List<Prestamo> getPrestamosByClienteId(Long idCliente);

    Prestamo savePrestamo(Prestamo prestamo);

    void deletePrestamo(Long id);

    void updatePrestamoFechaDevolucion(Long id, String fechaDevolucion);

    List<Cliente> getClientesByLibroTitulo(String titulo);

}
