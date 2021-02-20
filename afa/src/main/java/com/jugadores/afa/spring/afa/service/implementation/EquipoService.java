package com.jugadores.afa.spring.afa.service.implementation;

import com.jugadores.afa.spring.afa.exception.DAOException;
import com.jugadores.afa.spring.afa.exception.ServiceException;
import com.jugadores.afa.spring.afa.model.dto.EquipoDto;
import com.jugadores.afa.spring.afa.model.entity.Equipo;
import com.jugadores.afa.spring.afa.model.entity.Historia;
import com.jugadores.afa.spring.afa.repository.IEquipoRepository;
import com.jugadores.afa.spring.afa.repository.IHistoriaRepository;
import com.jugadores.afa.spring.afa.service.interfaces.IEquipoService;
import com.jugadores.afa.spring.afa.service.interfaces.IHistoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class EquipoService implements IEquipoService {
    @Autowired
    IEquipoRepository equipoRepository;

    @Autowired
    IHistoriaService historiaService;

    @Autowired
    IHistoriaRepository historiaRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public EquipoDto agregar(EquipoDto equipoDto) {
        Equipo equipo = equipoRepository.save(convertToEntity(equipoDto));
        if (equipo != null) {
            return convertToDto(equipo);
        } else {
            return null;
        }
    }

    @Override
    public EquipoDto modificar(EquipoDto equipoDto) {
        Equipo equipo = equipoRepository.save(convertToEntity(equipoDto));
        if (equipo != null) {
            return convertToDto(equipo);
        } else {
            return null;
        }
    }

    @Override
    public EquipoDto seleccionarPorCuit(Integer cuit) throws ServiceException {
        try {
            Equipo equipo = equipoRepository.findByCuit(cuit);
            if (equipo != null) {
                EquipoDto equipoDto = convertToDto(equipo);
                return equipoDto;
            } else {
                throw new ServiceException("Equipo " + cuit + " no existe");
            }
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<EquipoDto> seleccionar() throws ServiceException {
        List<Equipo> equipo = equipoRepository.findAll();
        if (equipo.isEmpty()) {
            throw new ServiceException("Tabla vacia");
        } else {
            List<EquipoDto> equipoDto = convertToDto(equipo);
            return equipoDto;
        }
    }

    @Override
    public void borrar(Integer cuit) throws ServiceException {
        try {
            Equipo equipo = equipoRepository.findByCuit(cuit);
            if (equipo != null) {
                equipoRepository.delete(equipo);
            } else {
                throw new ServiceException("Equipo con cuit " + cuit + " no existe");
            }
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    @Override
    public int cantidadDefensores(Integer cuit) throws ServiceException {
        int contador = 0;
        LocalDate fechaHoy = LocalDate.now();
        Equipo equipo = null;
        try {
            equipo = equipoRepository.findByCuit(cuit);
            if (equipo != null) {
                List<Historia> historias = historiaRepository.findByEquipo(equipo);
                for (Historia historia : historias) {
                    if (historiaService.defensorEnFecha(historiaService.convertToDto(historia), fechaHoy, convertToDto(equipo))) {
                        contador++;
                    }
                }
            } else {
                throw new ServiceException("El equipo con cuit " + cuit + " no existe");
            }
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
        return contador;
    }

    @Override
    public int cantidadJugadoresEnFecha(LocalDate fecha, Integer cuit) throws ServiceException{
        int contador = 0;
        Equipo equipo = null;
        try {
            equipo = equipoRepository.findByCuit(cuit);
            if (equipo != null) {
                List<Historia> historias = historiaRepository.findByEquipo(equipo);
                for (Historia historia : historias) {
                    if (historiaService.historiaEntreFechas(historiaService.convertToDto(historia), fecha)) {
                        contador++;
                    }
                }
            } else {
                throw new ServiceException("El equipo con cuit " + cuit + " no existe");
            }
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }

        return contador;
    }

    public Equipo convertToEntity(EquipoDto equipoDto) {
        Equipo equipo = modelMapper.map(equipoDto, Equipo.class);
        return equipo;
    }

    public List<Equipo> convertToEntity(List<EquipoDto> equiposDto) {
        List<Equipo> equipos = new ArrayList<>();
        for (EquipoDto equipoDto:equiposDto) {
            equipos.add(convertToEntity(equipoDto));
        }
        return equipos;
    }

    public EquipoDto convertToDto(Equipo equipo) {
        EquipoDto equipoDto = modelMapper.map(equipo, EquipoDto.class);
        return equipoDto;
    }

    public List<EquipoDto> convertToDto(List<Equipo> equiposJugador) {
        List<EquipoDto> equipos = new ArrayList<>();
        for (Equipo equipo:equiposJugador ) {
            equipos.add(convertToDto(equipo));
        }
        return equipos;
    }

}
