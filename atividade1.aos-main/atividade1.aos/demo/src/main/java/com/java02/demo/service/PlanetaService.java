package com.java02.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java02.demo.Repository.PlanetaRepository;

@Service
public class PlanetaService {
    
    @Autowired
    private PlanetaRepository planetaRepository;
}
