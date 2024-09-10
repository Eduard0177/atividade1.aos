package com.java02.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java02.demo.Model.Personagem;
import com.java02.demo.Repository.PersonagemRepository;

@Service
public class PersonagemService {
    
    @Autowired
    private PersonagemRepository personagemRepository;

    public List<Personagem> getPersonagensByRaca(String raca) {
        return personagemRepository.findByRaca(raca);
    }

    
}
