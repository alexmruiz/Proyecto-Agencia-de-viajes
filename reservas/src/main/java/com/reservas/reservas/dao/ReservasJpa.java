package com.reservas.reservas.dao;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.reservas.reservas.models.Reserva;

public interface ReservasJpa extends MongoRepository <Reserva, String>{

}
