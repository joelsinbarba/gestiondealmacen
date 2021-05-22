package com.uaa.gestiondealmacen.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int codigoProducto;
    private String descripcion;
    // private TipoProducto Tipo;
    private Double precio;
    private Double existencia;
    // private UnidadMedida UnidadMedida;


    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getExistencia() {
        return existencia;
    }

    public void setExistencia(Double existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "CodigoProducto=" + codigoProducto +
                ", Descripcion='" + descripcion + '\'' +
                ", Precio=" + precio +
                ", Existencia=" + existencia +
                '}';
    }
}
