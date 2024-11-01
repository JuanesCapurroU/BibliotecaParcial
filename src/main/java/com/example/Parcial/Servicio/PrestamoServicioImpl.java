package com.example.Parcial.Servicio;

import com.example.Parcial.Modelo.Cliente;
import com.example.Parcial.Modelo.Prestamo;
import com.example.Parcial.Repositorio.PrestamoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PrestamoServicioImpl implements PrestamoServicio {

    @Autowired
    private PrestamoRepositorio prestamoRepositorio;


    @Override
    public Optional<Prestamo> getPrestamoById(Long id) {
        return prestamoRepositorio.findById(id);
    }

    @Override
    public List<Prestamo> getAllPrestamos() {
        return prestamoRepositorio.findAll();
    }

    @Override
    public List<Prestamo> getPrestamosByFechaPrestamo(Date fechaPrestamo) {
        return prestamoRepositorio.findByFechaPrestamo(fechaPrestamo);
    }

    @Override
    public List<Prestamo> getPrestamosActivos() {
        return prestamoRepositorio.findPrestamosActivos();
    }

    @Override
    public List<Prestamo> getPrestamosByClienteId(Long idCliente) {
        return prestamoRepositorio.findByClienteId(idCliente);
    }

    @Override
    public Prestamo savePrestamo(Prestamo prestamo) {
        return prestamoRepositorio.save(prestamo);
    }

    @Override
    public void deletePrestamo(Long id) {

    }

    @Override
    public void updatePrestamoFechaDevolucion(Long id, String fechaDevolucion) {

    }
    @Override
    public List<Cliente> getClientesByLibroTitulo(String titulo) {
        return prestamoRepositorio.findClientesByLibroTitulo(titulo);
    }


}