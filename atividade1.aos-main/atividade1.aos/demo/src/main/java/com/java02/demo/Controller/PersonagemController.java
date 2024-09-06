package com.java02.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java02.demo.service.PersonagemService;

@RestController
@RequestMapping("/Personagem")
public class PersonagemController {
    
    @Autowired
    private PersonagemService personagemService;
}
