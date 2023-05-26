package com.softtek.hibernateejercicio3.repository;

import com.softtek.hibernateejercicio3.model.Nif;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INifRepo extends JpaRepository<Nif, Long> {
}
