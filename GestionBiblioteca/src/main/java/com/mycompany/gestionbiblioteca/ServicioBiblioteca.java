/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class ServicioBiblioteca  {
   private List <Libro> libros;
  

    public ServicioBiblioteca() {
        this.libros =new ArrayList<>();
        libros.add(new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", "Novela"));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela"));
        libros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", "Fábula"));
        libros.add(new Libro("1984", "George Orwell", "Distopía"));
        libros.add(new Libro("Fahrenheit 451", "Ray Bradbury", "Ciencia Ficción"));
        libros.add(new Libro("Una sola alma, muchos cuerpos ", "Brian Weiss", "Psicoterapia"));
        libros.add(new Libro("Matar a un ruiseñor", "Harper Lee", "Novela"));
    }

    
    public void AgregarLibro (Libro libro ){libros.add(libro);}
           
    public void EliminarLibro (String Titulo){libros.removeIf(( libro) -> libro.getTitulo().equals(Titulo));}
   
    public Libro BuscarLibro(String Titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(Titulo)) {
                return libro;
            }
        }
        return null;
    }
    public List<Libro>  BuscarLibrosPorAutor(String Autor) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(Autor)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
    public void ImprimirMenu(){
        System.out.println("Seleccione la opción que desee ejecutar:");
       
        System.out.println("1. Agregar un libro");
        System.out.println("2. Eliminar un libro");
        System.out.println("3. Buscar un libro por nombre");
        System.out.println("4. Buscar libros por autor");
        System.out.println("5. Agregar un cliente");
        System.out.println("6. Eliminar un cliente");
        System.out.println("0. Salir");
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Libro libro : libros) {
            result.append(libro.toString()).append("\n");
        }
        return result.toString();
    }

    
}
