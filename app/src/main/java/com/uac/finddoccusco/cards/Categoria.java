package com.uac.finddoccusco.cards;

import java.util.ArrayList;

public class Categoria {

    private String nombre;
    private int imagen;
    private ArrayList<MedicoGeneral> medicos;

    public Categoria(String nombre, int imagen, ArrayList<MedicoGeneral> medicos) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.medicos = medicos;
    }

    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<MedicoGeneral> getMedicos() { return this.medicos; }




}
