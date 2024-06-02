package com.mycompany.gestionbiblioteca;

public class Persona {
    private String Nombre;
    private String Dni;

    public Persona(String Nombre, String Dni) {
        this.Nombre = Nombre;
        this.Dni = Dni;
    }

    public String getNombre() {return Nombre;}

    public String getDni() {return Dni;}

    public void setNombre(String Nombre) {this.Nombre = Nombre;}

    public void setDni(String Dni) {this.Dni = Dni;}

    @Override
    public String toString() {
        return  "\nNombre: " + Nombre + "\nDni: " + Dni ;
    }
  
}
