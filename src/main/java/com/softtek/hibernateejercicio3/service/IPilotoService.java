package com.softtek.hibernateejercicio3.service;

import com.softtek.hibernateejercicio3.model.Piloto;

import java.util.List;

public interface IPilotoService {
    List<Piloto> findByTemporada(Long idTemporada);

    List<Piloto> findByEscuderia(Long idEscuderia);

    List<Piloto> findBySueldo(Integer sueldo);

    List<Piloto> findByPublicidad(Integer publicidad1, Integer publicidad2);

    List<Piloto> findNotInItaly();
}
