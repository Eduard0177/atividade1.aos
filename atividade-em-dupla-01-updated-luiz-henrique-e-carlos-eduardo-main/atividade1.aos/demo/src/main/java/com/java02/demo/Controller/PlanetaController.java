package com.java02.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java02.demo.Model.Planeta;
import com.java02.demo.service.PlanetaService;

@RestController
@RequestMapping("/Planeta")
public class PlanetaController {

    @Autowired
    private PlanetaService planetaService;

    @PutMapping("/{id}")
public ResponseEntity<Planeta> updatePlaneta(@PathVariable Long id, @RequestBody Planeta persDeta) {
        planetaService.updatePlanetaById(id, persDeta);
        return new ResponseEntity<>(persDeta, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePlaneta(@PathVariable Long id) {
        planetaService.deleteById(id);
        return null;
    }

    @CrossOrigin(origins = "*")
    @PostMapping
    public ResponseEntity<Planeta> savePlaneta(@RequestBody Planeta planeta) {
       Planeta planetaSalvo = planetaService.savePlaneta(planeta);
        return new ResponseEntity<>(planetaSalvo, HttpStatus.CREATED);
    }
    
}
