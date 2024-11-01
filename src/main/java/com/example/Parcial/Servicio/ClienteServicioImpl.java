package com.example.Parcial.Servicio;

import com.example.Parcial.Modelo.Cliente;
import com.example.Parcial.Repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicioImpl implements ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public Optional<Cliente> getClienteById(Long id) {
        return clienteRepositorio.findById(id);
    }

    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepositorio.findAll();
    }

    @Override
    public List<Cliente> getClientesByApellido(String apellido) {
        return clienteRepositorio.findByApellido(apellido);
    }

    @Override
    public List<Cliente> getClientesByEmail(String email) {
        return clienteRepositorio.findByEmail(email);
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepositorio.deleteById(id);
    }

    @Override
    public void updateClienteNombre(Long id, String nombre) {

    }
}
