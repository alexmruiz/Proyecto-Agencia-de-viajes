package com.mcs_hoteles.hoteles.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.mcs_hoteles.hoteles.model.Hotel;
import com.mcs_hoteles.hoteles.service.ServiceHoteles;

//@CrossOrigin(origins="*")
@RestController
public class HotelesController {

    @Autowired
    ServiceHoteles service;

    @GetMapping ("/hoteles")
    public List<Hotel> devolverHoteles (){
        return service.devolverHotelesDisponibles();
    }

    

    

}
