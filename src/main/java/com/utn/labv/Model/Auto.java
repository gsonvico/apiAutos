package com.utn.labv.Model;

/**
 * Created by Gustavo on 31/5/2017.
 */
public class Auto {

    private static int id=0;
    private int patente;
    private double kilometros;
    private int anio;
    private String modelo;
    private Marca marca;

    public Auto(String modelo, Marca marca, double kilometros, int anio)
    {
        patente=++id;
        this.kilometros=kilometros;
        this.anio=anio;
        this.modelo=modelo;
        this.marca=marca;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
