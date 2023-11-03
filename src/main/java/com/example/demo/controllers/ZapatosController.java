package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.models.Zapatos;
import com.example.demo.services.ZapatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ZapatosController {
    @Autowired
    ZapatosService zapatosService;

    @GetMapping("/zapatos")
    public ArrayList<Zapatos> obtenerZapatos(){
        return zapatosService.obtenerZapatos();
    }
    @GetMapping("/zapatos/{id}")
    public Optional<Zapatos> obtenerId(@PathVariable("id") Integer id){
        return this.zapatosService.obtenerId(id);
    }
}
