package com.uaa.gestiondealmacen.resource;

import com.uaa.gestiondealmacen.model.DetalleTransaccion;
import com.uaa.gestiondealmacen.service.DetalleTransaccionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalletransaccion")
public class DetalleTransaccionResource {
    private final DetalleTransaccionService detalleTransaccionService;

    public DetalleTransaccionResource(DetalleTransaccionService detalleTransaccionService) {
        this.detalleTransaccionService = detalleTransaccionService;
    }

    @GetMapping
    public ResponseEntity<List<DetalleTransaccion>> obtenerDetalleTransaccions(){
        List<DetalleTransaccion> detalleTransaccions = detalleTransaccionService.obtenerDetalleTransaccions();
        return  new ResponseEntity<>(detalleTransaccions, HttpStatus.OK);
    }

    @GetMapping("/{$id}")
    public ResponseEntity<DetalleTransaccion> obtenerDetalleTransaccion(@PathVariable("id") int id){
        DetalleTransaccion detalleTransaccion = detalleTransaccionService.obtenerDetalleTransaccion(id);
        return new ResponseEntity<>(detalleTransaccion, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<DetalleTransaccion> agregarDetalleTransaccion(@RequestBody DetalleTransaccion detalleTransaccion){
        DetalleTransaccion detalleTransaccionNuevo = detalleTransaccionService.agregarDetalleTransaccion(detalleTransaccion);
        return new ResponseEntity<>(detalleTransaccionNuevo, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<DetalleTransaccion> actualizarDetalleTransaccion(@RequestBody DetalleTransaccion detalleTransaccion){
        DetalleTransaccion detalleTransaccionActualizado = detalleTransaccionService.actualizarDetalleTransaccion(detalleTransaccion);
        return new ResponseEntity<>(detalleTransaccionActualizado, HttpStatus.CREATED);
    }

    @PostMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarDetalleTransaccion(@PathVariable("id") int id){
        detalleTransaccionService.eliminarDetalleTransaccion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
