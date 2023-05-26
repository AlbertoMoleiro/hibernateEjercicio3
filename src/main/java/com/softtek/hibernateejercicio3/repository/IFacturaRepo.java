package com.softtek.hibernateejercicio3.repository;

import com.softtek.hibernateejercicio3.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturaRepo extends JpaRepository<Factura, Long> {
}
