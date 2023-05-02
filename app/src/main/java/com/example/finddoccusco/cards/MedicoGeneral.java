package com.example.finddoccusco.cards;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class MedicoGeneral implements Parcelable {

    private String nombre;
    private int imagen;
    private String categoria;
    private String correo;
    private String apellidos;
    private String genero;
    private String direccion;
    private String celular;
    private double latitud;
    private double longitud;
    private ArrayList<String> horarios;

    public MedicoGeneral(String nombre, String apellidos, int imagen, String categoria, String correo, String genero, String direccion, String celular, double latitud, double longitud, ArrayList<String> horarios) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.correo = correo;
        this.apellidos = apellidos;
        this.genero = genero;
        this.direccion = direccion;
        this.celular = celular;
        this.latitud = latitud;
        this.longitud = longitud;
        this.horarios = horarios;
    }

    protected MedicoGeneral(Parcel in) {
        nombre = in.readString();
        imagen = in.readInt();
        categoria = in.readString();
        apellidos = in.readString();
        correo = in.readString();
        direccion = in.readString();
        celular = in.readString();
        genero = in.readString();
        latitud = in.readDouble();
        longitud = in.readDouble();
        horarios = in.createStringArrayList();


    }

    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() { return categoria; }

    public String getCorreo() {
        return this.correo;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getCelular() {
        return this.celular;
    }

    public double getLatitud() {
        return this.latitud;
    }

    public double getLongitud() {
        return this.longitud;
    }

    public ArrayList<String> getHorarios() {
        return this.horarios;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeInt(imagen);
        dest.writeString(categoria);
        dest.writeString(apellidos);
        dest.writeString(correo);
        dest.writeString(direccion);
        dest.writeString(celular);
        dest.writeString(genero);
        dest.writeDouble(latitud);
        dest.writeDouble(longitud);
        dest.writeStringList(horarios);


    }

    public static final Creator<MedicoGeneral> CREATOR = new Creator<MedicoGeneral>() {
        @Override
        public MedicoGeneral createFromParcel(Parcel in) {
            return new MedicoGeneral(in);
        }

        @Override
        public MedicoGeneral[] newArray(int size) {
            return new MedicoGeneral[size];
        }
    };



}
