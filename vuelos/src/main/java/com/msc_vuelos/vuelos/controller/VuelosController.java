package com.msc_vuelos.vuelos.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.msc_vuelos.vuelos.models.Vuelo;
import java.util.*;

import com.msc_vuelos.vuelos.service.VuelosService;

//@CrossOrigin(origins="*")
@RestController
public class VuelosController {

    @Autowired
    VuelosService service;

    @GetMapping("/vuelos/{plazas}")
    public List<Vuelo> devolverVuelo (@PathVariable int plazas){

        List<Vuelo> vuelos = service.recuperarVuelosDisponibles(plazas);
        return vuelos;
    }

    @PutMapping ("/vuelos/{idvuelo}/{plazas}")
    public void modificarVuelo (@PathVariable String idvuelo, @PathVariable int plazas){
        
        service.actualizarPlazas(idvuelo, plazas);

    }
}
