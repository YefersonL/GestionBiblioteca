
package gestionbiblioteca;

import java.util.Scanner;

/**
 *
 * @author renelobo
 */
public class GestionBiblioteca {

  
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Bienvenido a Konrad Library");
        System.out.println("1) Prestamo de libros");
        System.out.println("2) Buscar libros por autor");
        System.out.println("3) Buscar libros por titulo");
        System.out.println("4) Devolver libro");
        System.out.println("5) Salir");
        System.out.println("Ingrese una opcion");
        int opc = Integer.parseInt(scanner.nextLine());
        switch(opc){
        
            case 1:
                System.out.println("Ingrese el nombre del libro");
                String titulo = scanner.nextLine();
                biblioteca.prestarLibro(titulo);
                break;
            case 2: 
                System.out.println("Ingrese el autor a buscar");
                String autor = scanner.nextLine();
                biblioteca.buscarPorAutor(autor);
                
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
