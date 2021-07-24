package com.uaa.gestiondealmacen.resource;

import com.uaa.gestiondealmacen.model.Proveedor;
import com.uaa.gestiondealmacen.service.ProveedorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class ProveedorResource {

    private final ProveedorService proveedorService;

    public ProveedorResource(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping
    public ResponseEntity<List<Proveedor>> proveedorProveedors(){
        List<Proveedor> proveedores = proveedorService.obtenerProveedores();
        return  new ResponseEntity<>(proveedores, HttpStatus.OK);
    }

    @GetMapping("/{$id}")
    public ResponseEntity<Proveedor> obtenerProveedor(@PathVariable("id") int id){
        Proveedor proveedor = proveedorService.obtenerProveedor(id);
        return new ResponseEntity<>(proveedor, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Proveedor> agregarProveedor(@RequestBody Proveedor proveedor){
        Proveedor proveedorNuevo = proveedorService.agregarProveedor(proveedor);
        return new ResponseEntity<>(proveedorNuevo, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Proveedor> actualizarProveedor(@RequestBody Proveedor proveedor){
        Proveedor proveedorActualizado = proveedorService.actualizarProveedor(proveedor);
        return new ResponseEntity<>(proveedorActualizado, HttpStatus.CREATED);
    }

    @PostMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarProveedor(@PathVariable("id") int id){
        proveedorService.eliminarProveedor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
