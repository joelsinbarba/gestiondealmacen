package com.uaa.gestiondealmacen.repo;

import com.uaa.gestiondealmacen.model.DetalleTransaccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface DetalleTransaccionRepo extends JpaRepository<DetalleTransaccion, Integer> {

    void deleteDetalleTransaccionByID(int ID);

    Optional<DetalleTransaccion> findDetalleTransaccionByID(int ID);

}
