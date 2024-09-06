package com.java02.demo.Repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.java02.demo.Model.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository <Personagem,Long> {

public List<Personagem> FindByRaca();

    
}
