package com.jugadores.afa.spring.afa.repository;

import com.jugadores.afa.spring.afa.exception.DAOException;
import com.jugadores.afa.spring.afa.model.entity.Equipo;
import com.jugadores.afa.spring.afa.model.entity.Historia;
import com.jugadores.afa.spring.afa.model.entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IHistoriaRepository extends JpaRepository<Historia, Integer> {
    Historia findByJugadorAndEquipo(Jugador jugador,Equipo equipo) throws DAOException;
    List<Historia> findByEquipo(Equipo equipo) throws DAOException;
    Historia save(Historia historia);
    List<Historia> findAll();
    void delete(Historia historia);
    Optional<Historia> findById(Integer id);
}
