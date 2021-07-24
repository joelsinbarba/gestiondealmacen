package com.uaa.gestiondealmacen.repo;

import com.uaa.gestiondealmacen.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface ProveedorRepo extends JpaRepository<Proveedor, Integer> {

    void deleteProveedorByID(int ID);

    Optional<Proveedor> findProveedorByID(int ID);
}
