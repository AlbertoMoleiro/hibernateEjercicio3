package com.softtek.hibernateejercicio3.repository;

import com.softtek.hibernateejercicio3.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ITemporadaRepo extends JpaRepository<Temporada, Long>{
}
