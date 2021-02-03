package com.mycompany.jugadoresfutbol.service.implementation;

import com.mycompany.jugadoresfutbol.data.implementation.EquipoDAO;
import com.mycompany.jugadoresfutbol.data.interfaces.IEquipoDAO;
import com.mycompany.jugadoresfutbol.domain.Equipo;
import com.mycompany.jugadoresfutbol.dto.EquipoDto;
import com.mycompany.jugadoresfutbol.dto.JugadorDto;
import com.mycompany.jugadoresfutbol.service.interfaces.IEquipoService;
import com.mycompany.jugadoresfutbol.service.interfaces.IJugadorService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EquipoService implements IEquipoService {
    private EquipoDAO equipoDao = new EquipoDAO();
    private JugadorService jugadorService = new JugadorService();


    public void agregarEquipo(EquipoDto equipoDto) {
        Equipo equipo = convertDto(equipoDto);
        equipoDao.insert(equipo);
    }

    public int cantidadDefensoresEquipo (EquipoDto equipo) {
        int contador = 0;
        LocalDate fechaHoy = LocalDate.now();
        List<JugadorDto> jugadores  = equipo.getJugadores();
        IJugadorService jugadorService = null;
        for (JugadorDto j:jugadores) {
            if (jugadorService.defensorEnFecha(j, fechaHoy, equipo)) {
                contador++;
            }

        }
        return contador;
    }

    public int cantidadJugadoresEnFecha(LocalDate fecha, EquipoDto equipo) {
        if (fecha == null) {
            fecha = LocalDate.now();
        }
        int contador = 0;
        List<JugadorDto> jugadores = equipo.getJugadores();
        for (JugadorDto j:jugadores) {
            if (jugadorService.estaEntreFechas(j,fecha)) {
             contador++;
            }
        }
        return contador;
    }

    @Override
    public void modificarEquipo(EquipoDto equipoDto) {
        Equipo equipo = convertDto(equipoDto);
        this.equipoDao.update(equipo);
    }

    @Override
    public EquipoDto seleccionarEquipoPorCuit(int cuit) {
        return convertModel(this.equipoDao.select(cuit));
    }

    @Override
    public List<EquipoDto> seleccionarEquipos() {
        return convertModel(this.equipoDao.select());
    }

    @Override
    public void borrarEquipo(EquipoDto equipo) {
        this.equipoDao.delete(convertDto(equipo));
    }

    private Equipo convertDto(EquipoDto equipoDto) {
        Equipo equipo = new Equipo();
        equipo.setCuit(equipoDto.getCuit());
        equipo.setCategoriaActual(equipoDto.getCategoriaActual());
        equipo.setNombre(equipoDto.getNombre());
        equipo.setJugadores(jugadorService.convertDto(equipoDto.getJugadores()));

        return equipo;
    }

    private List<Equipo> convertDto(List<EquipoDto> equiposDto) {
        List<Equipo> equipos = new ArrayList<>();
        for (EquipoDto equipoDto:equiposDto ) {
            equipos.add(convertDto(equipoDto));
        }
        return equipos;
    }

    private EquipoDto convertModel(Equipo equipo) {
        EquipoDto equipoDto = new EquipoDto();
        equipoDto.setCuit(equipoDto.getCuit());
        equipoDto.setCategoriaActual(equipoDto.getCategoriaActual());
        equipoDto.setNombre(equipoDto.getNombre());
        equipoDto.setJugadores(jugadorService.convertModel(equipo.getJugadores()));

        return equipoDto;
    }

    private List<EquipoDto> convertModel(List<Equipo> equipos) {
        List<EquipoDto> equiposDto = new ArrayList<>();
        for (Equipo equipo:equipos ) {
            equiposDto.add(convertModel(equipo));
        }
        return equiposDto;
    }

}
