package com.ipartek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipartek.model.Receta;


@Repository
public interface RecetaRepository extends JpaRepository<Receta, Integer>{

}
