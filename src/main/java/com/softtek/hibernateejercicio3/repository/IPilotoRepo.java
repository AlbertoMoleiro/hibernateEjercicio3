package com.softtek.hibernateejercicio3.repository;

import com.softtek.hibernateejercicio3.model.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPilotoRepo extends JpaRepository<Piloto, Long> {
    @Query("FROM Piloto p JOIN p.temporadas t WHERE t.idTemporada = :temporada")
    List<Piloto> findByTemporada(@Param("temporada") Long temporada);

    @Query("FROM Piloto p WHERE p.escuderia.idEscuderia=:escuderia")
    List<Piloto> findByEscuderia(@Param("escuderia") Long escuderia);

    @Query("FROM Piloto p WHERE p.factura.sueldo >:sueldo")
    List<Piloto> findBySueldo(@Param("sueldo") Integer sueldo);


    @Query("FROM Piloto p WHERE p.factura.publicidad BETWEEN :publicidad1 AND :publicidad2")
    List<Piloto> findByPublicidad(@Param("publicidad1") Integer publicidad1, @Param("publicidad2") Integer publicidad2);

    @Query("FROM Piloto p WHERE p.escuderia.pais != 'Italia' ")
    List<Piloto> findNotInItaly();
}
