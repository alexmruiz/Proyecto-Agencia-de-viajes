package com.reservas.reservas.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.reservas.reservas.models.Reserva;

@Repository
public class ReservasDaoImpl implements ReservasDao {

    @Autowired
    ReservasJpa reservas;

    @Override
    public void generarReserva(Reserva reserva) {
        
        reservas.save(reserva);
        
    }

    @Override
    public List<Reserva> getReserva() {
       
        return reservas.findAll();
    }

    
}