package com.jugadores.afa.spring.afa.controller;

import com.jugadores.afa.spring.afa.exception.ServiceException;
import com.jugadores.afa.spring.afa.model.dto.HistoriaDto;
import com.jugadores.afa.spring.afa.service.implementation.HistoriaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/historia")
public class HistoriaController {

    @Autowired
    HistoriaService historiaService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> listarHistorias() throws ServiceException {
        Map<String,Object> response = new HashMap<>();
        List<HistoriaDto> historiasDto = null;
        try {
            historiasDto = historiaService.seleccionar();
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<List<HistoriaDto>>(historiasDto, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> verHistoria(@PathVariable Integer id) throws ServiceException {
        Map<String,Object> response = new HashMap<>();
        HistoriaDto historiaDto = null;
        try {
            historiaDto = historiaService.seleccionarPorId(id);
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<HistoriaDto>(historiaDto, HttpStatus.OK);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> agregarHistoria(@RequestBody HistoriaDto historiaDto) throws ServiceException {
        Map<String,Object> response = new HashMap<>();
        try {
            historiaDto = historiaService.agregar(historiaDto);
        } catch (DataAccessException e){
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<HistoriaDto>(historiaDto, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> modificarHistoria(@RequestBody HistoriaDto historiaDto,
                                               @PathVariable Integer id) throws ServiceException {
        HistoriaDto historiaNuevo = null;
        Map<String,Object> response = new HashMap<>();
        try {
            historiaNuevo = historiaService.seleccionarPorId(id);
            historiaNuevo.setFechaInicio(historiaDto.getFechaInicio());
            historiaNuevo.setFechaFin(historiaDto.getFechaFin());
            historiaNuevo.setNombreEquipo(historiaDto.getNombreEquipo());
            historiaNuevo.setPosicionCancha(historiaDto.getPosicionCancha());
            historiaNuevo.setEquipo(historiaDto.getEquipo());
            historiaNuevo.setJugador(historiaDto.getJugador());
            historiaNuevo = historiaService.modificar(historiaNuevo);
        } catch (DataAccessException | ServiceException e){
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<HistoriaDto>(historiaNuevo, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarHistoria(@PathVariable Integer id) throws ServiceException {
        Map<String,Object> response = new HashMap<>();
        try {
            historiaService.borrar(id);
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
