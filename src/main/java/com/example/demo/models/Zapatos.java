package com.example.demo.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.sql.Timestamp;
@Entity
@Table(name = "zapatos")
public class Zapatos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String marca;
    private String color;
    private String tipo;
    @Nullable
    private Integer estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String nombre) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String venta) {
        this.tipo = tipo;
    }

    @Nullable

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

}
