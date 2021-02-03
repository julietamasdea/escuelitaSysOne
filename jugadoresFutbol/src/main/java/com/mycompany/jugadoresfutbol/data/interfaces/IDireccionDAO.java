package com.mycompany.jugadoresfutbol.data.interfaces;

import com.mycompany.jugadoresfutbol.domain.Direccion;

import java.util.List;

public interface IDireccionDAO {
    int update(Direccion direccion);
    int insert(Direccion direccion);
    List<Direccion> select();
    int delete(Direccion direccion);
}
