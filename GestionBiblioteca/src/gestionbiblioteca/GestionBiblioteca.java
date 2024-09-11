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
        
        // Agregar libros predefinidos a la biblioteca
        biblioteca.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez"));
        biblioteca.agregarLibro(new Libro("Don Quijote", "Miguel de Cervantes"));


        System.out.println("Bienvenido a Konrad Library");
        while (true) {
            System.out.println("1) Prestamo de libros");
            System.out.println("2) Buscar libros por autor");
            System.out.println("3) Devolver libro");
            System.out.println("4) Salir");
            System.out.println("Ingrese una opcion:");

            int opc = Integer.parseInt(scanner.nextLine());
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del libro:");
                    String titulo = scanner.nextLine();
                    biblioteca.prestarLibro(titulo);
                    break;
                case 2:
                    System.out.println("Ingrese el autor a buscar:");
                    String autor = scanner.nextLine();
                    biblioteca.buscarPorAutor(autor);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del libro a devolver:");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(tituloDevolver);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
