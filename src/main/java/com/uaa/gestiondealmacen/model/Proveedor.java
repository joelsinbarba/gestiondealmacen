package com.uaa.gestiondealmacen.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Proveedor implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int ID;
    private String RUC;
    private String nombre;
    private String direccion;
    private String telefono;
    private String mail;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "RUC = '" + RUC +
                "', Nombre = '" + nombre +
                "', direccion = '" + direccion +
                "', telefono = '" + telefono +
                "', mail = '" + mail +
                "'}";

    }
}
