package com.uaa.gestiondealmacen.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Transaccion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int ID;
    private String Fecha;
    private int TipoEntidad;
    private String DocEntidad;
    private Double ImporteTotal;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
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

    @Override
    public String toString() {
        return "Transaccion{" +
                "ID=" + ID +
                ", Fecha='" + Fecha + '\'' +
                ", TipoEntidad=" + TipoEntidad +
                ", Doc_Entidad= '" + DocEntidad +
                ", ImporteTotal=" + ImporteTotal +
                '}';
    }
}
