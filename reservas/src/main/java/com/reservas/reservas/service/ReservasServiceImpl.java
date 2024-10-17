package com.reservas.reservas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.reservas.reservas.dao.ReservasDao;
import com.reservas.reservas.models.Reserva;

@Service
public class ReservasServiceImpl implements ReservasService{

    @Autowired
    ReservasDao reservas;
    @Autowired
    RestTemplate template;
    String url = "http://servicio-vuelos";

    @Override
    public void realizarReserva(Reserva reserva, int totalPersonas) {
        
        reservas.generarReserva(reserva);
        //Como no le pasamos nada el cuerpo le ponemos null
        template.put(url + "/vuelos/{p1}/{p2}", null, reserva.getVuelo(), totalPersonas);
    }

    @Override
    public List<Reserva> getReserva() {
       return this.reservas.getReserva();
    }

}
