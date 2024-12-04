package com.example.jugadoresxml;

public class Jugador {

    private int id;
    private String nombre;
    private String equipo;
    private int ano;
    private String posicion;

    public Jugador(int id, String nombre, String equipo, int ano, String posicion) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.ano = ano;
        this.posicion = posicion;
    }

    public Jugador(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", ano=" + ano +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
