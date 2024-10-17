package com.msc_vuelos.vuelos.models;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "vuelos")
public class Vuelo implements Serializable{
    private static final long serialVersionUID = 1L;


    @Id
    String idvuelo;

    String company;

    String fecha;

    double precio;

    int plazas;

    public Vuelo(String company, String fecha, double precio, int plazas) {
        this.company = company;
        this.fecha = fecha;
        this.precio = precio;
        this.plazas = plazas;
    }

    public Vuelo() {
    }

    public String getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(String idvuelo) {
        this.idvuelo = idvuelo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    

    



}
