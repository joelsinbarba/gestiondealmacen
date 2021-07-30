package com.uaa.gestiondealmacen.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Transaccion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int ID;
    private Date Fecha;
    private int TipoEntidad;
    private int TipoTransaccion;//0 - VENTA 1 - COMPRA - 2 - REEMBOLSO
    private String DocEntidad;
    private Double ImporteTotal;

    @OneToMany(mappedBy = "transaccion")
    private List<DetalleTransaccion> detalleTransaccionList;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public int getTipoEntidad() {
        return TipoEntidad;
    }

    public void setTipoEntidad(int tipoEntidad) {
        TipoEntidad = tipoEntidad;
    }

    public String getDocEntidad() {
        return DocEntidad;
    }

    public void setDocEntidad(String docEntidad) {
        DocEntidad = docEntidad;
    }

    public Double getImporteTotal() {
        return ImporteTotal;
    }

    public void setImporteTotal(Double importeTotal) {
        ImporteTotal = importeTotal;
    }

    public int getTipoTransaccion() {
        return TipoTransaccion;
    }

    public void setTipoTransaccion(int tipoTransaccion) {
        TipoTransaccion = tipoTransaccion;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "ID=" + ID +
                ", Fecha='" + Fecha + '\'' +
                ", TipoEntidad=" + TipoEntidad +
                ", TipoTransaccion=" + TipoTransaccion +
                ", Doc_Entidad= '" + DocEntidad +
                ", ImporteTotal=" + ImporteTotal +
                '}';
    }



}
