/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionbiblioteca;

import java.util.Scanner;

/**
 *
 * @author renelobo
 */
public class GestionBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        
        int opc = scanner.nextInt();
        System.out.println("Bienvenido a Konrad Library");
        System.out.println("1) Prestamo de libros");
        System.out.println("2) Buscar libros por autor");
        System.out.println("3) Buscar libros por titulo");
        System.out.println("4) Devolver libro");
        System.out.println("5) Salir");
        switch(opc){
        
            case 1:
                System.out.println();
                break;
            case 2: 
                System.out.println("");
                break;
            case 3: 
                System.out.println("");
                break;
            case 4: 
                System.out.println("");
                break;
            case 5:
                System.out.println("");
                break;
                
        
        }
    }
    
}
