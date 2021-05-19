package com.uaa.gestiondealmacen.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int CodigoProducto;
    private String Descripcion;
    // private TipoProducto Tipo;
    private Double Precio;
    private Double Existencia;
    // private UnidadMedida UnidadMedida;


    public int getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        CodigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public Double getExistencia() {
        return Existencia;
    }

    public void setExistencia(Double existencia) {
        Existencia = existencia;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "CodigoProducto=" + CodigoProducto +
                ", Descripcion='" + Descripcion + '\'' +
                ", Precio=" + Precio +
                ", Existencia=" + Existencia +
                '}';
    }
}
