package com.example.demo.controllers;

import com.example.demo.models.Clientes;
import com.example.demo.repositories.ClientesRepository;
import com.example.demo.services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/gasolina")
public class ClientesController {
    @Autowired
    ClientesService clientesService;

    @GetMapping("/clientes")
    public ArrayList<Clientes> obtenerClientes(){
        return clientesService.obtenerClientes();
    }
    @GetMapping("/clientes/{id}")
    public Optional<Clientes> obtenerId(@PathVariable("id") Integer id){
        return this.clientesService.obtenerId(id);
    }



  /*  @PutMapping("/clientesUpdate")
    public Optional<Clientes> update(@PathVariable Clientes nuevosDatos) {

        return  clientesService.updateClientes(nuevosDatos);
    }*/

    @PutMapping("/clientesUpdate")
    public Clientes updateClientes(@RequestBody Clientes punto){return clientesService.updateClientes(punto);}

}
