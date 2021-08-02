package com.uaa.gestiondealmacen.repo;

import com.uaa.gestiondealmacen.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {

    void deleteUsuarioByCI(int CI);

    Optional<Usuario> findUsuarioByCI(int CI);

    Optional<Usuario> findUsuarioByUsuarioLog(String usuarioLog);

}
