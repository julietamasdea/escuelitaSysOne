package com.jugadores.afa.spring.afa.service.interfaces;

import com.jugadores.afa.spring.afa.exception.ServiceException;
import com.jugadores.afa.spring.afa.model.dto.EquipoDto;

import java.time.LocalDate;
import java.util.List;

public interface IEquipoService {
    EquipoDto agregar(EquipoDto equipoDto);
    EquipoDto modificar(EquipoDto equipoDto);
    EquipoDto seleccionarPorCuit(Integer cuit) throws ServiceException;
    List<EquipoDto> seleccionar() throws ServiceException;
    void borrar(Integer cuit) throws ServiceException;

    int cantidadDefensores (Integer cuit) throws ServiceException;
    int cantidadJugadoresEnFecha(LocalDate fecha, Integer cuit) throws ServiceException;

}
