package com.example.demo.services;

import com.example.demo.models.Datos;
import com.example.demo.models.Role;
import com.example.demo.repositories.DatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DatosService {
    @Autowired
    DatosRepository datosRepository;

    public ArrayList<Datos> obtenerDatos(){
        return (ArrayList<Datos>) datosRepository.findAll();
    }

    public Datos guardarDatos(Datos datos){
        return datosRepository.save(datos);
    }
    public Optional<Datos> obtenerId(Integer id){
        return datosRepository.findById(id);
    }




}
