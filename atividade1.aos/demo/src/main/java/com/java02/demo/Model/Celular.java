package com.java02.demo.Model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
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

public class Celular {

    @Column(nullable = true, unique = false)
    private String marca;

    @Column(nullable = true, unique = false)
    private String modelo;

    @Column(nullable = true, unique = false)
    private String cor;

    @Column(nullable = true, unique = false)
    private String memoria;

    @ManyToOne
    private Pessoa donoPessoa;
}
