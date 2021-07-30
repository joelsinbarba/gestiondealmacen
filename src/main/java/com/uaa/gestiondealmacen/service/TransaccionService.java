package com.uaa.gestiondealmacen.service;

import com.uaa.gestiondealmacen.exception.ProductNotFoundException;
import com.uaa.gestiondealmacen.model.Transaccion;
import com.uaa.gestiondealmacen.repo.TransaccionRepo;
import com.uaa.gestiondealmacen.model.DetalleTransaccion;
import com.uaa.gestiondealmacen.repo.DetalleTransaccionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class TransaccionService {
    private final TransaccionRepo transaccionRepo;
    private final DetalleTransaccionRepo detalleTransaccionRepo;


    @Autowired
    public TransaccionService(TransaccionRepo transaccionRepo, DetalleTransaccionRepo detalleTransaccionRepo) {
        this.transaccionRepo = transaccionRepo;
        this.detalleTransaccionRepo = detalleTransaccionRepo;
    }

    public List<Transaccion> obtenerTransaccions(){
        return transaccionRepo.findAll();
    }

    public Transaccion obtenerTransaccion(int id){
        return transaccionRepo.findTransaccionByID(id).orElseThrow(()-> new ProductNotFoundException("El transaccion #" + id + "no fue encontrado"));
    }

    public Transaccion agregarTransaccion(Transaccion transaccion){
        //System.out.println("Insertando objeto factura");
        //LOG.info("Insertando objeto factura");
        //Transaccion transaccion1 = new Transaccion();
        //transaccion1.setFecha(new Date());
        //persist(factura);
        //transaccionRepo.save(transaccion);

        //LOG.info("Insertando detalle 1");
        //DetalleTransaccion det1 = new DetalleTransaccion(transaccion.getID(), 1);
        //detalleTransaccionRepo.save(det1);
        //det1.setDescripcion("PCs");
        //det1.setFactura(factura);
        //persist(det1);
        //LOG.log(Level.INFO, "detalle 1 insertada{0}", det1);
        //LOG.log(Level.INFO, "Factura insertada:{0}", factura);
        return transaccionRepo.save(transaccion);
    }

    public Transaccion actualizarTransaccion(Transaccion transaccion){
        return transaccionRepo.save(transaccion);
    }

    public void eliminarTransaccion(int id){
        transaccionRepo.deleteById(id);
    }



}
