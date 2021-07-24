package com.uaa.gestiondealmacen.resource;

import com.uaa.gestiondealmacen.model.Cliente;
import com.uaa.gestiondealmacen.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/Cliente")
public class ClienteResource {

    private final ClienteService clienteService;

    public ClienteResource(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> obtenerClientes(){
        List<Cliente> clientes = clienteService.obtenerClientes();
        return  new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @GetMapping("/{$id}")
    public ResponseEntity<Cliente> obtenerCliente(@PathVariable("id") int id){
        Cliente cliente = clienteService.obtenerCliente(id);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Cliente> agregarCliente(@RequestBody Cliente cliente){
        Cliente clienteNuevo = clienteService.agregarCliente(cliente);
        return new ResponseEntity<>(clienteNuevo, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Cliente> actualizarCliente(@RequestBody Cliente cliente){
        Cliente clienteActualizado = clienteService.actualizarCliente(cliente);
        return new ResponseEntity<>(clienteActualizado, HttpStatus.CREATED);
    }

    @PostMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarCliente(@PathVariable("id") int id){
        clienteService.eliminarCliente(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
