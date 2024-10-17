package com.reservas.reservas.service;

import com.reservas.reservas.models.Reserva;
import java.util.List;

public interface ReservasService {

    void realizarReserva(Reserva reserva, int totalPersonas);

    List<Reserva> getReserva();

}
