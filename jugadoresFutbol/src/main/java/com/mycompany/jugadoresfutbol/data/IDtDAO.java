package com.mycompany.jugadoresfutbol.data;

import com.mycompany.jugadoresfutbol.domain.Dt;

import java.util.List;

public interface IDtDAO {
    int update(Dt personaDTO);
    int insert(Dt personaDTO);
    List<Dt> select();
    int delete(Dt personaDTO);
}
