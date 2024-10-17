package com.mcs_hoteles.hoteles.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hoteles")
public class Hotel {

    @Id
    private String id_hotel;

    private String nombre;

    private int categoria;

    private double precio;

    private boolean disponible;

    public Hotel(String nombre, int categoria, double precio, boolean disponible) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Hotel() {
    }

    public String getIdHotel() {
        return id_hotel;
    }

    public void setIdHotel(String idHotel) {
        this.id_hotel = idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    


}
