package com.jugadores.afa.spring.afa.controller;

import com.jugadores.afa.spring.afa.exception.ServiceException;
import com.jugadores.afa.spring.afa.model.dto.EquipoDto;
import com.jugadores.afa.spring.afa.service.implementation.EquipoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

    @Autowired
    EquipoService equipoService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> listarEquipos() throws ServiceException {
        Map<String,Object> response = new HashMap<>();
        List<EquipoDto> equiposDto = null;
        try {
            equiposDto = equipoService.seleccionar();
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<List<EquipoDto>>(equiposDto, HttpStatus.OK);
    }

    @GetMapping("/{cuit}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> verEquipo(@PathVariable Integer cuit) throws ServiceException {
        Map<String,Object> response = new HashMap<>();
        EquipoDto equipoDto = null;
        try {
            equipoDto = equipoService.seleccionarPorCuit(cuit);
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<EquipoDto>(equipoDto, HttpStatus.OK);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> agregarEquipo(@RequestBody EquipoDto equipoDto) {
        Map<String,Object> response = new HashMap<>();
        try {
            equipoDto = equipoService.agregar(equipoDto);
        } catch (DataAccessException e){
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<EquipoDto>(equipoDto, HttpStatus.OK);
    }

    @PutMapping("/{cuit}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> modificarEquipo(@RequestBody EquipoDto equipoDto, @PathVariable Integer cuit) throws ServiceException{
        EquipoDto equipoNuevo = null;
        Map<String,Object> response = new HashMap<>();
        try {
            equipoNuevo = equipoService.seleccionarPorCuit(cuit);
            equipoNuevo.setCuit(equipoDto.getCuit());
            equipoNuevo.setNombre(equipoDto.getNombre());
            equipoNuevo = equipoService.modificar(equipoNuevo);
        } catch (DataAccessException | ServiceException e){
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<EquipoDto>(equipoNuevo, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{cuit}")
    public ResponseEntity<?> borrarEquipo(@PathVariable Integer cuit) throws ServiceException {
        Map<String,Object> response = new HashMap<>();
        try {
            equipoService.borrar(cuit);
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(cuit, HttpStatus.OK);
    }


    @GetMapping("/defensores/{cuit}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> cantidadDefensores(@PathVariable Integer cuit) throws ServiceException{
        Map<String,Object> response = new HashMap<>();
        Integer cantidadDefensores = null;
        try {
            cantidadDefensores = equipoService.cantidadDefensores(cuit);
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Integer>(cantidadDefensores, HttpStatus.OK);
    }

    @GetMapping("/jugadores/{cuit}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> cantidadJugadores(@PathVariable Integer cuit,
                                     @RequestParam(name = "fecha") String fecha) throws ServiceException {
        LocalDate localDate = LocalDate.parse(fecha);
        Map<String,Object> response = new HashMap<>();
        Integer cantidadJugadores = null;
        try {
            cantidadJugadores = equipoService.cantidadJugadoresEnFecha(localDate, cuit);
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Integer>(cantidadJugadores, HttpStatus.OK);
    }
}
