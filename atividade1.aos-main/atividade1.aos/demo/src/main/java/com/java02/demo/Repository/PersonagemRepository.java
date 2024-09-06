package com.java02.demo.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.java02.demo.Model.Personagem;

@Repository
public interface PersonagemRepository extends JpaRepository <Personagem,Long> {

    
}
