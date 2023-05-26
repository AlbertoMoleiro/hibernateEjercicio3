package com.softtek.hibernateejercicio3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "temporadas")
public class Temporada {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long idTemporada;

    @Column(nullable = false)
    private Integer inicio;

    @Column(nullable = false)
    private Integer fin;

    @ManyToMany(mappedBy = "temporadas")
    private Set<Piloto> pilotos;

}
