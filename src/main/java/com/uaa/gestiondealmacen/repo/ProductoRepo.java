package com.uaa.gestiondealmacen.repo;

import com.uaa.gestiondealmacen.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;


public interface ProductoRepo extends JpaRepository<Producto, Integer> {

    void deleteProductoByCodigoProducto(int CodigoProducto);

    Optional<Producto> findProductoByCodigoProducto(int CodigoProducto);

}
