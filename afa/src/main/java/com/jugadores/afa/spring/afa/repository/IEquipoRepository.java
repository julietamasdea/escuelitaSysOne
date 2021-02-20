package com.jugadores.afa.spring.afa.repository;

import com.jugadores.afa.spring.afa.exception.DAOException;
import com.jugadores.afa.spring.afa.model.entity.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEquipoRepository extends JpaRepository<Equipo, Integer> {
    Equipo findByCuit(Integer cuit) throws DAOException;
    Equipo save(Equipo equipo);
    List<Equipo> findAll();
    void delete(Equipo equipo);
}
