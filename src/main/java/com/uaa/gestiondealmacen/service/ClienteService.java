package com.uaa.gestiondealmacen.service;

import com.uaa.gestiondealmacen.exception.ProductNotFoundException;
import com.uaa.gestiondealmacen.model.Cliente;
import com.uaa.gestiondealmacen.repo.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional

public class ClienteService {

    private final ClienteRepo clienteRepo;

    @Autowired
    public ClienteService(ClienteRepo clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public List<Cliente> obtenerClientes(){
        return clienteRepo.findAll();
    }

    public Cliente obtenerCliente(int id){
        return clienteRepo.findClienteByID(id).orElseThrow(()-> new ProductNotFoundException("El Cliente #" + id + "no fue encontrado"));
    }

    public Cliente agregarCliente(Cliente cliente){
        //producto.setCodigoProducto();
        return clienteRepo.save(cliente);
    }

    public Cliente actualizarCliente(Cliente cliente){
        return clienteRepo.save(cliente);
    }

    public void eliminarCliente(int id){
        clienteRepo.deleteClienteByID(id);
    }

}
