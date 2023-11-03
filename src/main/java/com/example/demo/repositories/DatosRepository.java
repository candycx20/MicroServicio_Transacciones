package com.example.demo.repositories;

import com.example.demo.models.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosRepository extends JpaRepository<Datos, Integer> {

}