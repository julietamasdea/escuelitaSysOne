package com.jugadores.afa.spring.afa.repository;

import com.jugadores.afa.spring.afa.exception.DAOException;
import com.jugadores.afa.spring.afa.model.entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IJugadorRepository extends JpaRepository<Jugador, Integer> {
    Jugador findByDni(Integer dni) throws DAOException;
    Jugador save(Jugador jugador);
    List<Jugador> findAll();
    void delete(Jugador jugador);
}
