package com.mcs_hoteles.hoteles.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mcs_hoteles.hoteles.model.Hotel;

public interface HotelesJpa extends MongoRepository<Hotel, String> {


}
