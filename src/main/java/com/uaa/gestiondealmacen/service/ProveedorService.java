package com.uaa.gestiondealmacen.service;

import com.uaa.gestiondealmacen.exception.ProductNotFoundException;
import com.uaa.gestiondealmacen.model.Proveedor;
import com.uaa.gestiondealmacen.repo.ProveedorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional

public class ProveedorService {

    private final ProveedorRepo proveedorRepo;

    @Autowired
    public ProveedorService(ProveedorRepo proveedorRepo) {
        this.proveedorRepo = proveedorRepo;
    }

    public List<Proveedor> obtenerProveedores(){
        return proveedorRepo.findAll();
    }

    public Proveedor obtenerProveedor(int id){
        return proveedorRepo.findProveedorByID(id).orElseThrow(()-> new ProductNotFoundException("El proveedor #" + id + "no fue encontrado"));
    }

    public Proveedor agregarProveedor(Proveedor proveedor){
        //producto.setCodigoProducto();
        return proveedorRepo.save(proveedor);
    }

    public Proveedor actualizarProveedor(Proveedor proveedor){
        return proveedorRepo.save(proveedor);
    }

    public void eliminarProveedor(int id){
        proveedorRepo.deleteProveedorByID(id);
    }

}