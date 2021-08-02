package com.uaa.gestiondealmacen.resource;

import com.uaa.gestiondealmacen.model.Usuario;
import com.uaa.gestiondealmacen.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

    private final UsuarioService usuarioService;

    public UsuarioResource(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> obtenerUsuarios(){
        List<Usuario> usuarios = usuarioService.obtenerUsuarios();
        return  new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @GetMapping("/{$id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") int id){
        Usuario usuario = usuarioService.obtenerUsuario(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PostMapping("/agregar")
    public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNuevo = usuarioService.agregarUsuario(usuario);
        return new ResponseEntity<>(usuarioNuevo, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Usuario> actualizarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioActualizado = usuarioService.actualizarUsuario(usuario);
        return new ResponseEntity<>(usuarioActualizado, HttpStatus.CREATED);
    }

    @PostMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable("id") int id){
        usuarioService.eliminarUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario){
        String login = usuarioService.login(usuario);
        return new ResponseEntity<>(login, HttpStatus.OK);
    }





}
