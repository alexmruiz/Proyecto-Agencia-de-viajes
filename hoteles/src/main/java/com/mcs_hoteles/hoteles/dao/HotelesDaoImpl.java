package com.mcs_hoteles.hoteles.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mcs_hoteles.hoteles.model.Hotel;

@Repository
public class HotelesDaoImpl implements HotelesDao{

    @Autowired
    HotelesJpa hoteles;

    @Override
    public List<Hotel> devolverHoteles() {
        return hoteles.findAll();
    }


}
