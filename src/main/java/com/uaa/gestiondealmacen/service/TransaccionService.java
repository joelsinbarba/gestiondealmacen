package com.uaa.gestiondealmacen.service;

import com.uaa.gestiondealmacen.exception.ProductNotFoundException;
import com.uaa.gestiondealmacen.model.Transaccion;
import com.uaa.gestiondealmacen.repo.TransaccionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class TransaccionService {
    private final TransaccionRepo transaccionRepo;

    @Autowired
    public TransaccionService(TransaccionRepo transaccionRepo) {
        this.transaccionRepo = transaccionRepo;
    }

    public List<Transaccion> obtenerTransaccions(){
        return transaccionRepo.findAll();
    }

    public Transaccion obtenerTransaccion(int id){
        return transaccionRepo.findTransaccionByID(id).orElseThrow(()-> new ProductNotFoundException("El transaccion #" + id + "no fue encontrado"));
    }

    public Transaccion agregarTransaccion(Transaccion transaccion){
        //transaccion.setCodigoTransaccion();
        return transaccionRepo.save(transaccion);
    }

    public Transaccion actualizarTransaccion(Transaccion transaccion){
        return transaccionRepo.save(transaccion);
    }

    public void eliminarTransaccion(int id){
        transaccionRepo.deleteById(id);
    }


}
