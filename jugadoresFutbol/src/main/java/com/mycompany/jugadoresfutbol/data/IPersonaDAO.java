package com.mycompany.jugadoresfutbol.data;

import com.mycompany.jugadoresfutbol.domain.Persona;

import java.util.List;

public interface IPersonaDAO {
    int update(Persona personaDTO);
    int insert(Persona personaDTO);
    List<Persona> select();
    int delete(Persona personaDTO);
}
