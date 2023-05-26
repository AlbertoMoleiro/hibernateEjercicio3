package com.softtek.hibernateejercicio3.service;

import com.softtek.hibernateejercicio3.model.Telefono;

import java.util.List;

public interface ITelefonoService {

    List<Telefono> getByPilotoName(String nombre);
}
