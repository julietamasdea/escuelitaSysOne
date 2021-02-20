package com.jugadores.afa.spring.afa.service.interfaces;

import com.jugadores.afa.spring.afa.exception.ServiceException;
import com.jugadores.afa.spring.afa.model.dto.JugadorDto;

import java.util.List;

public interface IJugadorService {
    JugadorDto agregar(JugadorDto jugadorDto) throws ServiceException;
    JugadorDto modificar(JugadorDto jugadorDto) throws ServiceException;
    List<JugadorDto> seleccionar() throws ServiceException;
    JugadorDto seleccionarPorDni(Integer dni) throws ServiceException;
    void borrar(Integer dni) throws ServiceException;
}
