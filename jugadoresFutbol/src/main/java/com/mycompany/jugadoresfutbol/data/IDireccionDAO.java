package com.mycompany.jugadoresfutbol.data;

import com.mycompany.jugadoresfutbol.domain.Direccion;

import java.util.List;

public interface IDireccionDAO {
    int update(Direccion personaDTO);
    int insert(Direccion personaDTO);
    List<Direccion> select();
    int delete(Direccion personaDTO);
}
