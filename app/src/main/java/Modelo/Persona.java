package Modelo;

import java.io.Serializable;

public class Persona implements Serializable {
    String nombre,fecha,genero,telefono;

    public Persona() {

    }

    public Persona(String nombre, String fecha, String genero, String telefono) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.genero = genero;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
