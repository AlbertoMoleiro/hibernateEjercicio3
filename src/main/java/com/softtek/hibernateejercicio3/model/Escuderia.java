package com.softtek.hibernateejercicio3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "escuderias")
public class Escuderia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEscuderia;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String pais;

   @OneToMany(mappedBy = "escuderia", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private Set<Piloto> pilotos;

}
