package com.mycompany.jugadoresfutbol.data.interfaces;

import com.mycompany.jugadoresfutbol.domain.Persona;

import java.util.List;

public interface IPersonaDAO {
    int update(Persona persona);
    int insert(Persona persona);
    List<Persona> select();
    int delete(Persona persona);
}
