package com.mycompany.jugadoresfutbol.data;

import com.mycompany.jugadoresfutbol.domain.Equipo;

import java.util.List;

public interface IEquipoDAO {
    int update(Equipo personaDTO);
    int insert(Equipo personaDTO);
    List<Equipo> select();
    int delete(Equipo personaDTO);
}
