package com.example.Parcial.Controlador;

import com.example.Parcial.Modelo.Cliente;
import com.example.Parcial.Servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteControlador {

    @Autowired
    private ClienteServicio clienteServicio;

    // Obtener un Cliente por su ID
    @GetMapping("/{id}")
    public Optional<Cliente> getClienteById(@PathVariable Long id) {
        return clienteServicio.getClienteById(id);
    }

    // Obtener todos los Clientes
    @GetMapping("/todos")
    public List<Cliente> getAllClientes() {
        return clienteServicio.getAllClientes();
    }

    // Crear un Cliente
    @PostMapping("/guardar")
    public ResponseEntity<String> saveCliente(@RequestBody Cliente cliente) {
        Cliente savedCliente = clienteServicio.saveCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Cliente registrado con éxito. ID: " + savedCliente.getIdCliente());
    }

    // Actualizar nombre del Cliente por ID
    @PutMapping("/{id}/actualizarNombre")
    public void updateClienteNombre(@PathVariable Long id, @RequestParam String nombre) {
        clienteServicio.updateClienteNombre(id, nombre);
    }

    // Eliminar Cliente por ID
    @DeleteMapping("/eliminar/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteServicio.deleteCliente(id);
    }
}
