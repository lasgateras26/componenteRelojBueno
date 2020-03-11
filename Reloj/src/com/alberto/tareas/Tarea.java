package com.alberto.tareas;

import java.time.LocalDate;

public class Tarea {

    private String nombre;
    private LocalDate fecha;
    private int segundos;
    private int minutos;
    private int hora;

    public Tarea(String nombre, LocalDate fecha, int segundos, int minutos, int hora) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.segundos = segundos;
        this.minutos = minutos;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", segundos=" + segundos +
                ", minutos=" + minutos +
                ", hora=" + hora +
                '}';
    }
}