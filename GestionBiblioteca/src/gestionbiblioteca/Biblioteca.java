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
        for (Libro libro : libros) { // Mejor usar for-each para recorrer la lista
            if (libro.getTitulo().equals(titulo)) {
                if (!libro.isPrestado()) {
                    libro.setPrestado(true);
                    System.out.println("Libro prestado: " + titulo);
                } else {
                    System.out.println("El libro ya está prestado.");
                }
                return; // Detenemos el ciclo cuando encontramos el libro
            }
        }
        System.out.println("Libro no encontrado."); // Si no encuentra el libro
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                if (libro.isPrestado()) {
                    libro.setPrestado(false);
                    System.out.println("Libro devuelto: " + titulo);
                } else {
                    System.out.println("El libro no estaba prestado.");
                }
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }
    
    public void buscarPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                System.out.println("Libro encontrado: " + libro.getTitulo());
            }
        }
    }
}