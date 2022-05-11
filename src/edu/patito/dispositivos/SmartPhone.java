/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.dispositivos;

import ico.fes.factory.Dispositivo;

/**
 *
 * @author faysyo
 */
public class SmartPhone implements Dispositivo{
    private String modelo;
    private String sistemaOperativo;
    private String compañia;
    private String almacenamiento;
    private float precio;

    public SmartPhone() {
    }

    public SmartPhone(String modelo, String sistemaOperativo, String compañia, String almacenamiento, float precio) {
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.compañia = compañia;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return modelo;
    }

    public void setMarca(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "marca=" + modelo + ", sistemaOperativo=" + sistemaOperativo + ", compa\u00f1ia=" + compañia + ", almacenamiento=" + almacenamiento + ", precio= $" + precio + '}';
    }
    
    
    
    
}
