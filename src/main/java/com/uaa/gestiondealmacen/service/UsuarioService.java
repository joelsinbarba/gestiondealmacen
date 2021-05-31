package com.uaa.gestiondealmacen.service;

import com.uaa.gestiondealmacen.exception.ProductNotFoundException;
import com.uaa.gestiondealmacen.model.Usuario;
import com.uaa.gestiondealmacen.repo.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional

public class UsuarioService {

    private final UsuarioRepo usuarioRepo;

    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public List<Usuario> obtenerUsuarios(){
        return usuarioRepo.findAll();
    }

    public Usuario obtenerUsuario(int id){
        return usuarioRepo.findUsuarioByCI(id).orElseThrow(()-> new ProductNotFoundException("El usuario #" + id + "no fue encontrado"));
    }

    public Usuario agregarUsuario(Usuario usuario){
        //producto.setCodigoProducto();
        return usuarioRepo.save(usuario);
    }

    public Usuario actualizarUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }

    public void eliminarUsuario(int id){
        usuarioRepo.deleteUsuarioByCI(id);
    }

}
