package com.msc_vuelos.vuelos.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.msc_vuelos.vuelos.models.Vuelo;

public interface VuelosJpa extends MongoRepository <Vuelo, String>{

}
