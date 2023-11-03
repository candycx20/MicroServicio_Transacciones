package com.example.demo.services;

import com.example.demo.models.Clientes;
import com.example.demo.repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ClientesService {
    @Autowired
    ClientesRepository clientesRepository;

    public ArrayList<Clientes> obtenerClientes(){
        return (ArrayList<Clientes>) clientesRepository.findAll();
    }

    public Optional<Clientes> obtenerId(Integer id){
        return clientesRepository.findById(id);
    }

    public Clientes updateClientes(Clientes punto) { return clientesRepository.save(punto); }
}

