package com.softtek.hibernateejercicio3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "telefonos")
public class Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTelefono;

    @Column(nullable = false)
    private Long numero;

    @ManyToOne
    @JoinColumn(name = "id_piloto", nullable = false, foreignKey = @ForeignKey(name = "FK_piloto_telefono"))
    private Piloto piloto;
}
