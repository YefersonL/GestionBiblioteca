
package gestionbiblioteca;

import java.util.ArrayList;


public class Biblioteca {
    
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void prestarLibro(String titulo) {
        for(int i=0; i<libros.size(); i++){
        if(libros.get(i).getTitulo().equals(titulo) && libros.get(i).isPrestado()==false){
            
            System.out.println("Esta disponible el libro");
        }
            System.out.println("El libro se encuentra en prestamo");
        }
              
    }

    public void devolverLibro(String titulo) {
        // Implementar
    }

    public void buscarPorAutor(String autor) {
        for (int i = 0; i < 10; i++) {
            if(libros.get(i).getAutor().equals(autor)){
                System.out.println("Libro encontrado");
                System.out.println(libros.get(i));
            }
            
        }
    }

}