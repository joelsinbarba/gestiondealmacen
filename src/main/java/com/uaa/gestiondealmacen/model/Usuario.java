package com.uaa.gestiondealmacen.model;

import javax.persistence.*;
import java.io.Serializable;

    @Entity
    public class Usuario implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(nullable = false, updatable = false)
        private int CI;
        private String nombre;
        // private TipoProducto Tipo;
        //private Double puntos;
        private Double estado; //en ves de existencia, podria estar activo, bloqueado como cliente no deseado, etc
        // private UnidadMedida UnidadMedida;

        private String mail;
        private String usuarioLog;
        private String passLog;

        public int getCI() {
            return CI;
        }

        public void setCI(int CI) {
            this.CI = CI;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /*public Double getPuntos() {
            return puntos;
        }*/

        /*public void setPuntos(Double puntos) {
            this.puntos = puntos;
        }*/

        public Double getEstado() {
            return estado;
        }

        public void setEstado(Double estado) {
            this.estado = estado;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getUsuarioLog() {
            return usuarioLog;
        }

        public void setUsuarioLog(String usuarioLog) {
            this.usuarioLog = usuarioLog;
        }

        public String getPassLog() {
            return passLog;
        }

        public void setPassLog(String passLog) {
            this.passLog = passLog;
        }

        @Override
        public String toString() {
            return "Usuario{" +
                    "CI=" + CI +
                    ", Nombre='" + nombre + '\'' +
                    ", Estado=" + estado +
                    ", Mail=" + mail +
                    ", Usuario=" + usuarioLog +
                    ", Pass=" + passLog +
                    '}';
        }
}
