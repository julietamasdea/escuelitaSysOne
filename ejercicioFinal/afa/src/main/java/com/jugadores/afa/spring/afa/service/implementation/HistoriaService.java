package com.jugadores.afa.spring.afa.service.implementation;

import com.jugadores.afa.spring.afa.exception.ServiceException;
import com.jugadores.afa.spring.afa.model.dto.EquipoDto;
import com.jugadores.afa.spring.afa.model.dto.HistoriaDto;
import com.jugadores.afa.spring.afa.model.entity.Historia;
import com.jugadores.afa.spring.afa.repository.IHistoriaRepository;
import com.jugadores.afa.spring.afa.service.interfaces.IHistoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HistoriaService implements IHistoriaService {
    @Autowired
    IHistoriaRepository historiaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public HistoriaDto agregar(HistoriaDto historiaDto) {
        Historia historia = historiaRepository.save(convertToEntity(historiaDto));
        return convertToDto(historia);
    }

    @Override
    public HistoriaDto modificar(HistoriaDto historiaDto) {
        Historia historia = historiaRepository.save(convertToEntity(historiaDto));
        return convertToDto(historia);
    }

    @Override
    public List<HistoriaDto> seleccionar() throws ServiceException {
        List<HistoriaDto> historias = convertToDto(historiaRepository.findAll());
        if (historias.isEmpty()) {
            throw new ServiceException("Tabla vacia");
        } else {
            return historias;
        }
    }

    @Override
    public HistoriaDto seleccionarPorId(Integer id) throws ServiceException {
        Optional<Historia> historiaOptional = historiaRepository.findById(id);
        if (historiaOptional.isPresent()) {
            Historia historia = historiaOptional.get();
            return convertToDto(historia);
        } else {
            throw new ServiceException("Historia " + id + " no existe");
        }

    }

    @Override
    public void borrar(Integer id) throws ServiceException {
        Optional<Historia> historia = historiaRepository.findById(id);
        if (historia.isPresent()) {
            historiaRepository.delete(historia.get());
        } else {
            throw new ServiceException("Historia " + id + " no existe");
        }
    }

    @Override
    public boolean historiaEntreFechas(HistoriaDto historiaDto, LocalDate fecha) {
        LocalDate fechaFin = LocalDate.now();
        if (historiaDto.getFechaFin() != null) {
            fechaFin = historiaDto.getFechaFin();
        }
        if (fecha != null) {
            if (fecha.isAfter(historiaDto.getFechaInicio().minusDays(1))
                    && fecha.isBefore(fechaFin.plusDays(1))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean defensorEnFecha(HistoriaDto historiaDto, LocalDate fecha, EquipoDto equipoDto) {
        LocalDate fechaFin = LocalDate.now();
        if (historiaDto.getFechaFin() != null) {
            fechaFin = historiaDto.getFechaFin();
        }
        if (fecha != null) {
            if (fecha.isAfter(historiaDto.getFechaInicio().minusDays(1)) && fecha.isBefore(fechaFin.plusDays(1))
                    && ("defensor").equals(historiaDto.getPosicionCancha().toLowerCase())
                    && ((equipoDto.getNombre().toLowerCase()).equals(historiaDto.getNombreEquipo().toLowerCase()))) {
                return true;
            }
        }
        return false;
    }

    public Historia convertToEntity(HistoriaDto historiaDto) {
        Historia historia = modelMapper.map(historiaDto, Historia.class);
        return historia;
    }

    public List<Historia> convertToEntity(List<HistoriaDto> historiasDto) {
        List<Historia> historias = new ArrayList<>();
        for (HistoriaDto historiaDto:historiasDto ) {
            historias.add(convertToEntity(historiaDto));
        }
        return historias;
    }

    public HistoriaDto convertToDto(Historia historia) {
        HistoriaDto historiaDto = modelMapper.map(historia, HistoriaDto.class);
        return historiaDto;
    }

    public HistoriaDto convertToDto(Optional<Historia> historia) {
        HistoriaDto historiaDto = modelMapper.map(historia, HistoriaDto.class);
        return historiaDto;
    }

    public List<HistoriaDto> convertToDto(List<Historia> equiposJugador) {
        List<HistoriaDto> historiasDto = new ArrayList<>();
        for (Historia historia:equiposJugador ) {
            historiasDto.add(convertToDto(historia));
        }
        return historiasDto;
    }
}
