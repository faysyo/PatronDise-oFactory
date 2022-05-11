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
public class Tablet implements Dispositivo{
    private String modelo;
    private String sitemaOperativo;
    private boolean almacenamientoExterno;
    private float precio;

    public Tablet() {
    }

    public Tablet(String modelo, String sitemaOperativo, boolean almacenamientoExterno, float precio) {
        this.modelo = modelo;
        this.sitemaOperativo = sitemaOperativo;
        this.almacenamientoExterno = almacenamientoExterno;
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

    public void setMarca(String marca) {
        this.modelo = marca;
    }

    public String getSitemaOperativo() {
        return sitemaOperativo;
    }

    public void setSitemaOperativo(String sitemaOperativo) {
        this.sitemaOperativo = sitemaOperativo;
    }

    public boolean isAlmacenamientoExterno() {
        return almacenamientoExterno;
    }

    public void setAlmacenamientoExterno(boolean almacenamientoExterno) {
        this.almacenamientoExterno = almacenamientoExterno;
    }

    @Override
    public String toString() {
        return "Tablet{" + "marca=" + modelo + ", sitemaOperativo=" + sitemaOperativo + ", almacenamientoExterno=" + almacenamientoExterno + ", precio= $" + precio + '}';
    }
    
    
}
