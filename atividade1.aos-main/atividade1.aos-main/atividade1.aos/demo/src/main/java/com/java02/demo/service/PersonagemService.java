package com.java02.demo.service;

import java.util.List;
import java.util.Optional;

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

    public void deleteById(Long id) {
        if (personagemRepository.existsById(id)) {
            personagemRepository.deleteById(id);
        }
    }

    public Personagem updatePersonagemById(Long id, Personagem personagemAtualizado) {
        Optional<Personagem> personagemExistente = personagemRepository.findById(id);
        
        if (personagemExistente.isPresent()) {
            Personagem personagem = personagemExistente.get();

            // Atualizando os campos do personagem com base nos dados fornecidos
            personagem.setNome(personagemAtualizado.getNome());
            personagem.setRaca(personagemAtualizado.getRaca());
    
            // Adicione aqui quaisquer outros campos que precisam ser atualizados

            // Salvando o personagem atualizado no banco de dados
            return personagemRepository.save(personagem);
        }
    
}
}
