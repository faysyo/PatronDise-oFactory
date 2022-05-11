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
public class Computadora  implements Dispositivo{
    private String marca;
    private String sistemaOperativo;
    private String procesador;
    private String memoria;
    private float precio;

    public Computadora() {
    }

    public Computadora(String marca, String sistemaOperativo, String procesador, String memoria, float precio) {
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.memoria = memoria;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String memoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", sistemaOperativo=" + sistemaOperativo + ", procesador=" + procesador + ", memoria=" + memoria + ", precio= $" + precio + '}';
    }

    
    
}
