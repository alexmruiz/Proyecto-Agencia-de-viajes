package com.reservas.reservas.dao;

import com.reservas.reservas.models.Reserva;
import java.util.List;

public interface ReservasDao {

    public void generarReserva(Reserva reserva);

    List<Reserva> getReserva();

}
