package com.java02.demo.Model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EnableAutoConfiguration

public class Pessoa {
    
    @Column(nullable = false, unique = false)
    private String nome;

    @Column(nullable = false, unique = false)
    private int qntde_Cel;

    @OneToMany
    private Celular celular;
    
}
