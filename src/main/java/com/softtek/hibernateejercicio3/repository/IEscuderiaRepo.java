package com.softtek.hibernateejercicio3.repository;

import com.softtek.hibernateejercicio3.model.Escuderia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEscuderiaRepo extends JpaRepository<Escuderia, Long> {
}
