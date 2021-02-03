package com.mycompany.jugadoresfutbol.service.implementation;

import com.mycompany.jugadoresfutbol.data.implementation.EquipoDAO;
import com.mycompany.jugadoresfutbol.data.implementation.JugadorDAO;
import com.mycompany.jugadoresfutbol.domain.Equipo;
import com.mycompany.jugadoresfutbol.domain.Jugador;
import com.mycompany.jugadoresfutbol.dto.EquipoDto;
import com.mycompany.jugadoresfutbol.dto.Equipo_JugadorDto;
import com.mycompany.jugadoresfutbol.dto.JugadorDto;
import com.mycompany.jugadoresfutbol.service.interfaces.IJugadorService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JugadorService implements IJugadorService {
    private Equipo_JugadorService equipoJugadorService = new Equipo_JugadorService();
    private JugadorDAO jugadorDao = new JugadorDAO();

    public boolean estaEntreFechas(JugadorDto jugador, LocalDate fecha) {
        List<Equipo_JugadorDto> historial = jugador.getHistoriaJugador();
        for (Equipo_JugadorDto historia:historial) {
            LocalDate fechaFin = LocalDate.now();
            if (historia.getFecha_fin() != null) {
                fechaFin = historia.getFecha_fin();
            }
            if (fecha != null) {
                if (fecha.isAfter(historia.getFecha_inicio().minusDays(1))
                        && fecha.isBefore(fechaFin.plusDays(1))) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean defensorEnFecha(JugadorDto jugador, LocalDate fecha, EquipoDto equipo) {
        List<Equipo_JugadorDto> historial = jugador.getHistoriaJugador();
        for (Equipo_JugadorDto historia:historial) {
            LocalDate fechaFin = LocalDate.now();
            if (historia.getFecha_fin() != null) {
                fechaFin = historia.getFecha_fin();
            }
            if (fecha != null) {
                if (fecha.isAfter(historia.getFecha_inicio().minusDays(1)) && fecha.isBefore(fechaFin.plusDays(1))
                        && ("defensor").equals(historia.getPosicionCancha().toLowerCase())
                        && ((equipo.getNombre().toLowerCase()).equals(historia.getNombreEquipo().toLowerCase()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public Jugador convertDto(JugadorDto jugadorDto) {
        Jugador jugador = new Jugador();
        jugador.setNombre(jugadorDto.getNombre());
        jugador.setApellido(jugadorDto.getApellido());
        jugador.setDni(jugadorDto.getDni());
        jugador.setHistoriaJugador(equipoJugadorService.convertDto(jugadorDto.getHistoriaJugador()));
        return jugador;
    }

    public List<Jugador> convertDto(List<JugadorDto> jugadoresDto) {
        List<Jugador> jugadores = new ArrayList<>();
        for (JugadorDto jugadorDto:jugadoresDto) {
            jugadores.add(convertDto(jugadorDto));
        }
        return jugadores;
    }

    public JugadorDto convertModel(Jugador jugador) {
        JugadorDto jugadorDto = new JugadorDto();
        jugadorDto.setNombre(jugador.getNombre());
        jugadorDto.setApellido(jugador.getApellido());
        jugadorDto.setDni(jugador.getDni());
        jugadorDto.setHistoriaJugador(equipoJugadorService.convertModel(jugador.getHistoriaJugador()));
        return jugadorDto;
    }

    public List<JugadorDto> convertModel(List<Jugador> jugadores) {
        List<JugadorDto> jugadoresDto = new ArrayList<>();
        for (Jugador jugador:jugadores) {
            jugadoresDto.add(convertModel(jugador));
        }
        return jugadoresDto;
    }

    @Override
    public void agregarJugador(JugadorDto jugadorDto) {
        Jugador jugador = convertDto(jugadorDto);
        jugadorDao.insert(jugador);
    }

    @Override
    public void modificarJugador(JugadorDto jugadorDto) {
        Jugador jugador = convertDto(jugadorDto);
        jugadorDao.update(jugador);
    }

    @Override
    public List<JugadorDto> seleccionarJugadores() {
        return convertModel(this.jugadorDao.select());
    }
}
