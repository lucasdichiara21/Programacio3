
package com.mycompany.gestionbiblioteca;

import com.mycompany.gestionbiblioteca.Biblioteca;
import com.mycompany.gestionbiblioteca.Libro;
import com.mycompany.gestionbiblioteca.Persona;
import com.mycompany.gestionbiblioteca.ServicioBiblioteca;
import java.util.List;
import java.util.Scanner;


public class GestionBiblioteca {
    public static void main(String[] args) {
       ServicioBiblioteca servicioBiblioteca = new ServicioBiblioteca();
        Biblioteca biblioteca = new Biblioteca(servicioBiblioteca);
        Scanner scanner = new Scanner(System.in);
        int ops;

        do {
            System.out.println(biblioteca);
            biblioteca.ImprimirMenu();
            ops = scanner.nextInt();
            scanner.nextLine();
            
            switch (ops) {
                
                   
                case 1:
                    System.out.println("Ingrese el título del libro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor del libro:");
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el género del libro:");
                    String genero = scanner.nextLine();
                    biblioteca.AgregarLibro(new Libro(titulo, autor, genero));
                    break;

                case 2:
                    System.out.println("Ingrese el título del libro a eliminar:");
                    titulo = scanner.nextLine();
                    biblioteca.EliminarLibro(titulo);
                    break;
                case 3:
                    System.out.println("Ingrese el título del libro a buscar:");
                    titulo = scanner.nextLine();
                    Libro libro = biblioteca.BuscarLibro(titulo);
                    System.out.println(libro != null ? libro : "Libro no encontrado");
                    break;

                case 4:
                    System.out.println("Ingrese el autor de los libros a buscar:");
                    autor = scanner.nextLine();
                    List<Libro> libros = biblioteca.BuscarLibrosPorAutor(autor);
                    if (libros.isEmpty()) {
                        System.out.println("No se encontraron libros de este autor");
                    } else {
                        for (Libro l : libros) {
                            System.out.println(l);
                        }
                    }
                    
                    break;

                case 5:
                    System.out.println("Ingrese el nombre del cliente:");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el DNI del cliente:");
                    String dni = scanner.nextLine();
                    biblioteca.AgregarSocio(new Persona(nombre, dni));
                    break;

                case 6:
                    System.out.println("Ingrese el DNI del cliente a eliminar:");
                    dni = scanner.nextLine();
                    biblioteca.EliminarSocio(dni);
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestra biblioteca. Vuelva pronto");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (ops != 0);

        
    }
}
