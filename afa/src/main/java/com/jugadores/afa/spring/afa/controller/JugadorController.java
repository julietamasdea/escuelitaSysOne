package com.jugadores.afa.spring.afa.controller;

import com.jugadores.afa.spring.afa.exception.ServiceException;
import com.jugadores.afa.spring.afa.model.dto.HistoriaDto;
import com.jugadores.afa.spring.afa.model.dto.JugadorDto;
import com.jugadores.afa.spring.afa.service.implementation.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jugador")
public class JugadorController {

    @Autowired
    JugadorService jugadorService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> listarJugadores() throws ServiceException{
        Map<String,Object> response = new HashMap<>();
        List<JugadorDto> jugadoresDto = null;
        try {
            jugadoresDto = jugadorService.seleccionar();
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<List<JugadorDto>>(jugadoresDto, HttpStatus.OK);
    }

    @GetMapping("/{dni}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> verJugador(@PathVariable Integer dni) throws ServiceException {
        Map<String,Object> response = new HashMap<>();
        JugadorDto jugadorDto = null;
        try {
            jugadorDto = jugadorService.seleccionarPorDni(dni);
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<JugadorDto>(jugadorDto, HttpStatus.OK);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> agregarJugador(@RequestBody JugadorDto jugadorDto) throws ServiceException {
        Map<String,Object> response = new HashMap<>();
        try {
            jugadorDto = jugadorService.agregar(jugadorDto);
        } catch (DataAccessException e){
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<JugadorDto>(jugadorDto, HttpStatus.OK);
    }

    @PutMapping("/{dni}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> modificarJugador(@RequestBody JugadorDto jugadorDto, @PathVariable Integer dni) throws ServiceException {
        JugadorDto jugadorNuevo = null;
        Map<String,Object> response = new HashMap<>();
        try {
            jugadorNuevo = jugadorService.seleccionarPorDni(dni);

            jugadorNuevo.setDni(jugadorDto.getDni());
            jugadorNuevo.setNombre(jugadorDto.getNombre());
            jugadorNuevo.setApellido(jugadorDto.getApellido());
            jugadorNuevo = jugadorService.modificar(jugadorNuevo);
        } catch (DataAccessException | ServiceException e){
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<JugadorDto>(jugadorNuevo, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{dni}")
    public ResponseEntity<?> borrarJugador(@PathVariable Integer dni) throws ServiceException {
        Map<String,Object> response = new HashMap<>();
        JugadorDto jugador;
        try {
            jugadorService.borrar(dni);
        } catch (ServiceException e) {
            response.put("message", (e.getMessage()));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(dni, HttpStatus.OK);
    }
}
