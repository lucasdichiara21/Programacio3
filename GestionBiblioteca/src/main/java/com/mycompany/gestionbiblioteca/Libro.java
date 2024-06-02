
package com.mycompany.gestionbiblioteca;

public class Libro {
    
   private String Titulo;
   private String Autor;
   private String Genero;

    public Libro(String Titulo, String Autor, String Genero) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Genero = Genero;      
    }

    public String getTitulo() { return Titulo;}

    public String getAutor() {return Autor;}
    

    public String getGenero() {return Genero;}
        
    public void setTitulo(String Titulo) {this.Titulo = Titulo;}

    public void setAutor(String Autor) {this.Autor = Autor;}

    public void setGenero(String Genero) {this.Genero = Genero;}

    @Override
    public String toString() {
        return  "\nTitulo: " + Titulo + "\nAutor: " + Autor + "\nGenero: " + Genero ;
    }    
  }

   

    


    
   
  

    
    

