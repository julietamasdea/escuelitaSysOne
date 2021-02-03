package com.mycompany.jugadoresfutbol.service.interfaces;

import com.mycompany.jugadoresfutbol.domain.Equipo;
import com.mycompany.jugadoresfutbol.dto.EquipoDto;

import java.time.LocalDate;
import java.util.List;

public interface IEquipoService {
    void agregarEquipo(EquipoDto equipoDto);
    int cantidadDefensoresEquipo (EquipoDto equipoDto);
    int cantidadJugadoresEnFecha(LocalDate fecha, EquipoDto equipoDto);
    void modificarEquipo(EquipoDto equipoDto);
    EquipoDto seleccionarEquipoPorCuit(int cuit);
    List<EquipoDto> seleccionarEquipos();
    void borrarEquipo(EquipoDto equipoDto);
}
