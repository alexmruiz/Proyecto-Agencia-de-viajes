package com.msc_vuelos.vuelos.service;

import com.msc_vuelos.vuelos.models.Vuelo;
import java.util.*;

public interface VuelosService {

    List<Vuelo> recuperarVuelosDisponibles(int plazas);

    void actualizarPlazas(String vuelo, int plazas);

}
