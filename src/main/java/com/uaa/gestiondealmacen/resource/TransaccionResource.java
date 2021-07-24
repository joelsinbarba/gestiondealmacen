package com.uaa.gestiondealmacen.resource;

import com.uaa.gestiondealmacen.model.Transaccion;
import com.uaa.gestiondealmacen.service.TransaccionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaccion")
public class TransaccionResource {
    private final TransaccionService transaccionService;

    public TransaccionResource(TransaccionService transaccionService) {
        this.transaccionService = transaccionService;
    }

    @GetMapping
    public ResponseEntity<List<Transaccion>> obtenerTransaccions(){
        List<Transaccion> transaccions = transaccionService.obtenerTransaccions();
        return  new ResponseEntity<>(transaccions, HttpStatus.OK);
    }

    @GetMapping("/{$id}")
    public ResponseEntity<Transaccion> obtenerTransaccion(@PathVariable("id") int id){
        Transaccion transaccion = transaccionService.obtenerTransaccion(id);
        return new ResponseEntity<>(transaccion, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Transaccion> agregarTransaccion(@RequestBody Transaccion transaccion){
        Transaccion transaccionNuevo = transaccionService.agregarTransaccion(transaccion);
        return new ResponseEntity<>(transaccionNuevo, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Transaccion> actualizarTransaccion(@RequestBody Transaccion transaccion){
        Transaccion transaccionActualizado = transaccionService.actualizarTransaccion(transaccion);
        return new ResponseEntity<>(transaccionActualizado, HttpStatus.CREATED);
    }

    @PostMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarTransaccion(@PathVariable("id") int id){
        transaccionService.eliminarTransaccion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
