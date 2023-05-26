package com.softtek.hibernateejercicio3.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pilotos")
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPiloto;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(nullable = false)
    private int edad;


    @OneToOne
    @JoinColumn(name = "id_factura", nullable = false, foreignKey = @ForeignKey(name = "FK_factura_piloto"))
    private Factura factura;

    @OneToOne
    @JoinColumn(name = "id_nif", nullable = false, foreignKey = @ForeignKey(name = "FK_nif_piloto"))
    private Nif nif;

    @ManyToOne
    @JoinColumn(name = "id_escuderia", nullable = false, foreignKey = @ForeignKey(name = "FK_escuderia_piloto"))
    private Escuderia escuderia;

    @OneToMany(mappedBy = "piloto", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Telefono> telefonos;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "pilotos_temporadas",
            joinColumns = @JoinColumn(name = "id_piloto", referencedColumnName = "idPiloto"),
            inverseJoinColumns = @JoinColumn(name = "id_temporada", referencedColumnName = "idTemporada"))
    private Set<Temporada> temporadas;


}
