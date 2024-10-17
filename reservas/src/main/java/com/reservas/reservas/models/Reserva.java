package com.reservas.reservas.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reservas")
public class Reserva {


    @Id
    private String idreserva;  

    private String nombre;
    private String dni;
    private String hotel;
    private String vuelo;

    // Constructor con parámetros
    public Reserva(String nombre, String dni, String hotel, String vuelo) {
        this.nombre = nombre;
        this.dni = dni;
        this.hotel = hotel;
        this.vuelo = vuelo;
    }

    // Constructor vacío
    public Reserva() {
    }

    // Getters y setters
    public String getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(String idreserva) {
        this.idreserva = idreserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }
}
