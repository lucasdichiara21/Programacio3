
package com.mycompany.gestionbiblioteca;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca{
    private ServicioBiblioteca servicioBiblioteca;
    private List<Persona> personas;
    
  
    
    public Biblioteca(){
    }

    public Biblioteca(ServicioBiblioteca servicioBiblioteca) {
        this.servicioBiblioteca = servicioBiblioteca;
        this.personas = new ArrayList<>();
        personas.add(new Persona("Juan Perez", "12345678"));
        personas.add(new Persona("Maria Gomez", "23456789"));
        personas.add(new Persona("Carlos Ruiz", "34567890"));
        personas.add(new Persona("Ana Hernandez", "45678901"));
        personas.add(new Persona("Luis Fernandez", "56789012"));
        personas.add(new Persona("Marta Martinez", "67890123"));
        personas.add(new Persona("Pedro Sanchez", "78901234"));
        
    }
    
    public void AgregarSocio (Persona persona){personas.add(persona);}
    public void EliminarSocio (String Dni){ personas.removeIf(persona->persona.getDni().equals(Dni));}
    
    public void AgregarLibro (Libro libro){servicioBiblioteca.AgregarLibro(libro);}
    
    public void EliminarLibro (String Titulo){servicioBiblioteca.EliminarLibro(Titulo);}
    
    public Libro BuscarLibro(String Titulo){return servicioBiblioteca.BuscarLibro(Titulo);}
    
    public List<Libro> BuscarLibrosPorAutor(String Autor) {return servicioBiblioteca.BuscarLibrosPorAutor(Autor);}
    public void ImprimirMenu(){servicioBiblioteca.ImprimirMenu();}
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Usuarios:\n");
        for (Persona persona : personas) {
            result.append(persona.toString()).append("\n");
        }
        result.append("\nLibros:\n").append(servicioBiblioteca);
        return result.toString();
    }
}
