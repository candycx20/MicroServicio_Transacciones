package com.example.demo.services;

import com.example.demo.models.Zapatos;
import com.example.demo.repositories.ZapatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ZapatosService {
    @Autowired
    ZapatosRepository zapatosRepository;

    public ArrayList<Zapatos> obtenerZapatos(){
        return (ArrayList<Zapatos>) zapatosRepository.findAll();
    }
    public Optional<Zapatos> obtenerId(Integer id){
        return zapatosRepository.findById(id);
    }
}
