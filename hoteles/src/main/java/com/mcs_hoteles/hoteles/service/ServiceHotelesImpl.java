package com.mcs_hoteles.hoteles.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcs_hoteles.hoteles.dao.HotelesDao;
import com.mcs_hoteles.hoteles.model.Hotel;

@Service
public class ServiceHotelesImpl implements ServiceHoteles{

    @Autowired
    HotelesDao dao;

    @Override
    public List<Hotel> devolverHotelesDisponibles() {
        
        List <Hotel> hoteles = dao.devolverHoteles();

        return hoteles.stream().filter(t->t.getDisponible()==true).collect(Collectors.toList());
    }

}
