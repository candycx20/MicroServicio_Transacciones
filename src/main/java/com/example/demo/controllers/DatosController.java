package com.example.demo.controllers;


import com.example.demo.models.Datos;
import com.example.demo.models.Role;
import com.example.demo.services.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DatosController {
    @Autowired
    DatosService datosService;

    @GetMapping("/datos")
    public ArrayList<Datos> obtenerZapatos(){
        return datosService.obtenerDatos();
    }

    @PostMapping("/datosg")
    public Datos guardarDatos(@RequestBody Datos datos){
        return this.datosService.guardarDatos(datos);
    }

    @GetMapping("/datos/{id}")
    public Optional<Datos> obtenerId(@PathVariable("id") Integer id){
        return this.datosService.obtenerId(id);
    }
}
