package com.utn.labv.ListAutos;

import com.utn.labv.Model.Auto;
import com.utn.labv.Model.Marca;
import org.springframework.stereotype.Service;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Gustavo on 31/5/2017.
 */
@Service
public class DAOAutos {

    private Hashtable<Integer, Auto> listAutos;

    public DAOAutos ()
    {
        listAutos = new Hashtable<>();
        this.cargarAutos();
    }

    private void cargarAutos()
    {
        Marca ford = new Marca("Ford");
        Marca fiat = new Marca("Fiat");
        Marca audi = new Marca("Audi");
        Marca volswagen = new Marca("Volswagen");

        Auto auto1=new Auto("Fiesta", ford, 2000.2, 2005);
        Auto auto2=new Auto("Mondeo", ford, 150.89, 2015);
        Auto auto3=new Auto("Falcon", ford, 200000.2, 1980);
        Auto auto4=new Auto("Punto", fiat, 200.2, 2017);
        Auto auto5=new Auto("Kubo", fiat, 1986.19, 2015);
        Auto auto6=new Auto("TT", audi, 1000.9, 2010);
        Auto auto7=new Auto("Gol", volswagen, 20340.2, 2005);
        Auto auto8=new Auto("Suran", volswagen, 122345.2, 2005);
        Auto auto9=new Auto("Trend", volswagen, 1000.2, 2015);
        Auto auto10=new Auto("Voyage", volswagen, 28000.2, 2014);

        listAutos.put(auto1.getPatente(),auto1);
        listAutos.put(auto2.getPatente(),auto2);
        listAutos.put(auto3.getPatente(),auto3);
        listAutos.put(auto4.getPatente(),auto4);
        listAutos.put(auto5.getPatente(),auto5);
        listAutos.put(auto6.getPatente(),auto6);
        listAutos.put(auto7.getPatente(),auto7);
        listAutos.put(auto8.getPatente(),auto8);
        listAutos.put(auto9.getPatente(),auto9);
        listAutos.put(auto10.getPatente(),auto10);
    }

    public Auto byId(int id)
    {
        return listAutos.get(id);
    }

    public Enumeration<Auto> byAll()
    {
        return listAutos.elements();
    }

    public Enumeration<Auto> byMarca (Marca marca)
    {
        Auto aux=null;
        Hashtable <Integer,Auto> rta = new Hashtable<>();
        Enumeration <Auto> e = listAutos.elements();

        while (e.hasMoreElements())
        {
            aux=e.nextElement();
            if (aux.getMarca().equals(marca))
                rta.put(aux.getPatente(), aux);
        }
        return rta.elements();
    }

    public void addAuto(Auto a)
    {
        listAutos.put(a.getPatente(),a);
    }
}
