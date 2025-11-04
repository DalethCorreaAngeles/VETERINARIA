package com.example.veterinaria.model;

import jakarta.persistence.*;

@Entity
@Table(name = "mascotas")

public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombre ;


    @Column(nullable = false)
    private String especie; //Perro, Gato, Loros, Iguana, Etc


    private String raza;

    @Column(nullable = false)
    private Integer edad;

    //Agregar nuevo req.peso
    @Column(nullable = false)
    private Double peso;

    // Constructor vacío
    public Mascota(){
    }

    // Constructor con parámetros
    public Mascota(String raza, String nombre, String especie, Integer edad, Double peso) {
        this.id = id;
        this.raza = raza;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    // Getters y Setters

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
