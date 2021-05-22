package com.uaa.gestiondealmacen.service;

import com.uaa.gestiondealmacen.exception.ProductNotFoundException;
import com.uaa.gestiondealmacen.model.Producto;
import com.uaa.gestiondealmacen.repo.ProductoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class ProductoService {
    private final ProductoRepo productoRepo;

    @Autowired
    public ProductoService(ProductoRepo productoRepo) {
        this.productoRepo = productoRepo;
    }

    public List<Producto> obtenerProductos(){
        return productoRepo.findAll();
    }

    public Producto obtenerProducto(int id){
        return productoRepo.findProductoByCodigoProducto(id).orElseThrow(()-> new ProductNotFoundException("El producto #" + id + "no fue encontrado"));
    }

    public Producto agregarProducto(Producto producto){
        //producto.setCodigoProducto();
        return productoRepo.save(producto);
    }

    public Producto actualizarProducto(Producto producto){
        return productoRepo.save(producto);
    }

    public void eliminarProducto(int id){
        productoRepo.deleteById(id);
    }


}
