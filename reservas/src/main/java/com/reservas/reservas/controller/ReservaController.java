package com.reservas.reservas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.reservas.reservas.models.Reserva;
import com.reservas.reservas.service.ReservasService;

//@CrossOrigin(origins="*")
@RestController
public class ReservaController {

    @Autowired
    ReservasService service;

    @PostMapping("/reservas/{personas}")
    public void generarReserva(@RequestBody Reserva reserva, @PathVariable int personas){
        this.service.realizarReserva(reserva, personas);
    }

    @GetMapping("/reservas")
    public List<Reserva> getReserva(){
        return this.service.getReserva();
    }

}
