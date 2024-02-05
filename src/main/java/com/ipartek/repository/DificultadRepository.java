package com.ipartek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipartek.model.Dificultad;


@Repository
public interface DificultadRepository extends JpaRepository<Dificultad, Integer> {

}
