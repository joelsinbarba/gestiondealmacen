package com.uaa.gestiondealmacen.repo;

import com.uaa.gestiondealmacen.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepo extends JpaRepository<Cliente, Integer> {

    void deleteClienteByID(int ID);

    Optional<Cliente> findClienteByID(int ID);
}
