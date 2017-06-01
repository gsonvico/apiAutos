package com.utn.labv.Model;

/**
 * Created by Gustavo on 31/5/2017.
 */
public class Marca {
    private String descripcion;

    public Marca(String descripcion)
    {
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString()
    {
        return descripcion;
    }

    public boolean equals (Object o)
    {
        Marca aux = (Marca) o;
        if(aux.getDescripcion().equals(this.getDescripcion())) {
            return true;
        }
        return false;
    }
}

