package com.uaa.gestiondealmacen.repo;

import com.uaa.gestiondealmacen.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface TransaccionRepo extends JpaRepository<Transaccion, Integer> {

    void deleteTransaccionByID(int ID);

    Optional<Transaccion> findTransaccionByID(int ID);

}
