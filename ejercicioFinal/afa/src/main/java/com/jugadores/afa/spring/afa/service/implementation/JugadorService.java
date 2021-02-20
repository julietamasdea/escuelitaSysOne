package com.jugadores.afa.spring.afa.service.implementation;

import com.jugadores.afa.spring.afa.exception.DAOException;
import com.jugadores.afa.spring.afa.exception.ServiceException;
import com.jugadores.afa.spring.afa.model.dto.JugadorDto;
import com.jugadores.afa.spring.afa.model.entity.Jugador;
import com.jugadores.afa.spring.afa.repository.IJugadorRepository;
import com.jugadores.afa.spring.afa.service.interfaces.IJugadorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JugadorService implements IJugadorService {
    @Autowired
    IJugadorRepository jugadorRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public JugadorDto agregar(JugadorDto jugadorDto) {
        Jugador jugador = jugadorRepository.save(convertToEntity(jugadorDto));
        if (jugador != null) {
            return convertToDto(jugador);
        } else {
            return null;
        }
    }

    @Override
    public JugadorDto modificar(JugadorDto jugadorDto) {
        Jugador jugador = jugadorRepository.save(convertToEntity(jugadorDto));
        if (jugador != null) {
            return convertToDto(jugador);
        } else {
            return null;
        }
    }

    @Override
    public List<JugadorDto> seleccionar() throws ServiceException {
        List<Jugador> jugadores = jugadorRepository.findAll();
        if (jugadores.isEmpty()) {
            throw new ServiceException("Tabla vacia");
        } else {
            return convertToDto(jugadores);
        }
    }

    @Override
    public JugadorDto seleccionarPorDni(Integer dni) throws ServiceException {
        try {
            Jugador jugador = jugadorRepository.findByDni(dni);
            if (jugador != null) {
                return convertToDto(jugador);
            } else {
                throw new ServiceException("Jugador " + dni + " no existe");
            }
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    public void borrar(Integer dni) throws ServiceException {
        try {
            Jugador jugador = jugadorRepository.findByDni(dni);
            if (jugador != null) {
                jugadorRepository.delete(jugador);
            } else {
                throw new ServiceException("Jugador con dni " + dni + " no existe");
            }
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    public Jugador convertToEntity(JugadorDto jugadorDto) {
        Jugador jugador = modelMapper.map(jugadorDto, Jugador.class);
        return jugador;
    }

    public List<Jugador> convertToEntity(List<JugadorDto> jugadoresDto) {
        List<Jugador> jugadores = new ArrayList<>();
        for (JugadorDto jugadorDto:jugadoresDto ) {
            jugadores.add(convertToEntity(jugadorDto));
        }
        return jugadores;
    }

    public JugadorDto convertToDto(Jugador jugador) {
        JugadorDto jugadorDto = modelMapper.map(jugador, JugadorDto.class);
        return jugadorDto;
    }

    public List<JugadorDto> convertToDto(List<Jugador> equiposJugador) {
        List<JugadorDto> jugadoresDto = new ArrayList<>();
        for (Jugador jugador:equiposJugador ) {
            jugadoresDto.add(convertToDto(jugador));
        }
        return jugadoresDto;
    }
}
