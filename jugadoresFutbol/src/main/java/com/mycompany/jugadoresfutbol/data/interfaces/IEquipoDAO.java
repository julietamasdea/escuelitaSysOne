package com.mycompany.jugadoresfutbol.data.interfaces;

import com.mycompany.jugadoresfutbol.domain.Equipo;

import java.util.List;

public interface IEquipoDAO {
    int update(Equipo equipo);
    int insert(Equipo equipo);
    List<Equipo> select();
    Equipo select(int cuit);
    int delete(Equipo equipo);
}
