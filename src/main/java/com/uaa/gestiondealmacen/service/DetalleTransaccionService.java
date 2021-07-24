package com.uaa.gestiondealmacen.service;

import com.uaa.gestiondealmacen.exception.ProductNotFoundException;
import com.uaa.gestiondealmacen.model.DetalleTransaccion;
import com.uaa.gestiondealmacen.repo.DetalleTransaccionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class DetalleTransaccionService {
    private final DetalleTransaccionRepo detalleTransaccionRepo;

    @Autowired
    public DetalleTransaccionService(DetalleTransaccionRepo detalleTransaccionRepo) {
        this.detalleTransaccionRepo = detalleTransaccionRepo;
    }

    public List<DetalleTransaccion> obtenerDetalleTransaccions(){
        return detalleTransaccionRepo.findAll();
    }

    public DetalleTransaccion obtenerDetalleTransaccion(int id){
        return detalleTransaccionRepo.findDetalleTransaccionByID(id).orElseThrow(()-> new ProductNotFoundException("El detalleTransaccion #" + id + "no fue encontrado"));
    }

    public DetalleTransaccion agregarDetalleTransaccion(DetalleTransaccion detalleTransaccion){
        //detalleTransaccion.setCodigoDetalleTransaccion();
        return detalleTransaccionRepo.save(detalleTransaccion);
    }

    public DetalleTransaccion actualizarDetalleTransaccion(DetalleTransaccion detalleTransaccion){
        return detalleTransaccionRepo.save(detalleTransaccion);
    }

    public void eliminarDetalleTransaccion(int id){
        detalleTransaccionRepo.deleteById(id);
    }


}
