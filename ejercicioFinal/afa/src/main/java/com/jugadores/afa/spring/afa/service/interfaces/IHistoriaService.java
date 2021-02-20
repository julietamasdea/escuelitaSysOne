package com.jugadores.afa.spring.afa.service.interfaces;

import com.jugadores.afa.spring.afa.exception.ServiceException;
import com.jugadores.afa.spring.afa.model.dto.EquipoDto;
import com.jugadores.afa.spring.afa.model.dto.HistoriaDto;
import com.jugadores.afa.spring.afa.model.entity.Historia;

import java.time.LocalDate;
import java.util.List;

public interface IHistoriaService {
    HistoriaDto agregar(HistoriaDto historiaDto) throws ServiceException;
    HistoriaDto modificar(HistoriaDto historiaDto) throws ServiceException;
    List<HistoriaDto> seleccionar() throws ServiceException;
    HistoriaDto seleccionarPorId(Integer id) throws ServiceException;
    void borrar(Integer id) throws ServiceException;

    boolean historiaEntreFechas(HistoriaDto historiaDto, LocalDate localdate);
    boolean defensorEnFecha(HistoriaDto historiaDto, LocalDate fecha, EquipoDto equipoDto);
    HistoriaDto convertToDto(Historia historia);
    List<HistoriaDto> convertToDto(List<Historia> equiposJugador);
    Historia convertToEntity(HistoriaDto historiaDto);
    List<Historia> convertToEntity(List<HistoriaDto> historiasDto);


}
