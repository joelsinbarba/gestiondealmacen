package com.uaa.gestiondealmacen.resource;

import com.uaa.gestiondealmacen.model.Producto;
import com.uaa.gestiondealmacen.service.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoResource {
    private final ProductoService productoService;

    public ProductoResource(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public ResponseEntity<List<Producto>> obtenerProductos(){
        List<Producto> productos = productoService.obtenerProductos();
        return  new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("/{$id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable("id") int id){
        Producto producto = productoService.obtenerProducto(id);
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Producto> agregarProducto(@RequestBody Producto producto){
        Producto productoNuevo = productoService.agregarProducto(producto);
        return new ResponseEntity<>(productoNuevo, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Producto> actualizarProducto(@RequestBody Producto producto){
        Producto productoActualizado = productoService.actualizarProducto(producto);
        return new ResponseEntity<>(productoActualizado, HttpStatus.OK);
    }

    @PostMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarProducto(@PathVariable("id") int id){
        productoService.eliminarProducto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
