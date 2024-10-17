package com.msc_vuelos.vuelos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msc_vuelos.vuelos.dao.VuelosDaoImpl;
import com.msc_vuelos.vuelos.models.Vuelo;
import java.util.stream.Collectors;

@Service
public class VuelosServiceImpl implements VuelosService {

    @Autowired
    VuelosDaoImpl dao;

    @Override
    public List<Vuelo> recuperarVuelosDisponibles(int plazas) {
        
        return dao.devolverVuelos()
            .stream()
            .filter(t->t.getPlazas()>=plazas)
            .collect(Collectors.toList());
    }

@Override
public void actualizarPlazas(String id, int plazas) {  // Cambiado a String
    Vuelo vuelo = dao.devolverVuelo(id);  // Asegúrate de que devolverVuelo reciba un String

    if (vuelo != null) {
        vuelo.setPlazas(vuelo.getPlazas() - plazas);
        dao.actualizarVuelo(vuelo);
    }
}




}
