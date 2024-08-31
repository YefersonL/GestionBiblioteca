/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionbiblioteca;

import java.util.ArrayList;

/**
 *
 * @author renelobo
 */
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
        // Implementar
    }

    public void devolverLibro(String titulo) {
        // Implementar
    }

    public void buscarPorAutor(String autor) {
        // Implementar
    }

}