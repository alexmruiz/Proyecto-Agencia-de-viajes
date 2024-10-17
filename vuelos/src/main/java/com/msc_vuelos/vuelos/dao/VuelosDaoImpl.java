package com.msc_vuelos.vuelos.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.msc_vuelos.vuelos.models.Vuelo;

@Repository
public class VuelosDaoImpl implements VuelosDao{

    @Autowired
    VuelosJpa vueloJpa;

    @Override
    public List<Vuelo> devolverVuelos() {
     return vueloJpa.findAll();
    }

    @Override//Recibe un int como parámetro pero el id es de tipo String
    public Vuelo devolverVuelo(String idvuelo) {
        return vueloJpa.findById(String.valueOf(idvuelo)).orElse(null);
    }

    @Override
    public void actualizarVuelo(Vuelo vuelo) {
       vueloJpa.save(vuelo);
    }

}
