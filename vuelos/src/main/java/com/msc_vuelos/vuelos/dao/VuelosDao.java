package com.msc_vuelos.vuelos.dao;

import com.msc_vuelos.vuelos.models.Vuelo;
import java.util.*;

public interface VuelosDao {

    public List<Vuelo> devolverVuelos();

    public Vuelo devolverVuelo (String idvuelo);

    public void actualizarVuelo(Vuelo vuelo);

}
