package com.softtek.hibernateejercicio3.repository;

import com.softtek.hibernateejercicio3.model.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITelefonoRepo extends JpaRepository<Telefono, Long> {

    @Query("FROM Telefono t WHERE t.piloto.nombre =:nombre")
    List<Telefono> getByPilotoName(@Param("nombre") String nombre);
}
