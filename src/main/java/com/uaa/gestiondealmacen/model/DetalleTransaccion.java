package com.uaa.gestiondealmacen.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetalleTransaccion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int ID;
    private int ID_Transaccion;
    private int codigoProducto;
    private int Cantidad;
    private Double Importe;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID_Transaccion() {
        return ID_Transaccion;
    }

    public void setID_Transaccion(int ID_Transaccion) {
        this.ID_Transaccion = ID_Transaccion;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Double getImporte() {
        return Importe;
    }

    public void setImporte(Double importe) {
        Importe = importe;
    }

    @Override
    public String toString() {
        return "DetalleTransaccion{" +
                "ID=" + ID +
                ", ID_Transaccion=" + ID_Transaccion +
                ", codigoProducto=" + codigoProducto +
                ", Cantidad=" + Cantidad +
                ", Importe=" + Importe +
                '}';
    }
}
