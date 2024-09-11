/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventariotienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author renelobo
 */
public class InventarioTienda {

    /**
     * @param args the command line arguments
     */
    static ArrayList<DispositivoElectronico> inventario;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inventario = new ArrayList<>();
        int opc;
        while (true) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1.Agregar dispositivos");
            System.out.println("2.Vender dispositivos");
            System.out.println("3.Mostrar dispositivos");
            System.out.println("4.Aplicar descuento a una marca");
            System.out.println("5. Calcular valor total de inventario");
            System.out.println("Ingrese una opcion: ");
            opc = Integer.parseInt(sc.nextLine());
            if (opc == 1) {
                System.out.println("1.Lapto");
                System.out.println("2.Smartphone");
                System.out.println("3.Tablet");
                System.out.println("Ingrese una opcion: ");
                opc = Integer.parseInt(sc.nextLine());
                switch (opc) {
                    case 1:
                        {
                            Laptop newlapto = new Laptop();
                            System.out.println("Ingrese la marca de la lapto: ");
                            String marca = sc.nextLine();
                            newlapto.setMarca(marca);
                            System.out.println("Ingrese el nombre del procesador: ");
                            String procesador = sc.nextLine();
                            newlapto.setProcesador(procesador);
                            System.out.println("Ingrese el nombre: ");
                            String nombre = sc.nextLine();
                            newlapto.setNombre(nombre);
                            System.out.println("Ingrese el precio: ");
                            double precio = Integer.parseInt(sc.nextLine());
                            newlapto.setPrecio(precio);
                            System.out.println("Ingrese el Stock donde se ubicara: ");
                            int stock = Integer.parseInt(sc.nextLine());
                            newlapto.setStock(stock);
                            agregarDispositivo(newlapto);
                            break;
                        }
                    case 2:
                        {
                            Smartphone newSmart = new Smartphone();
                            System.out.println("Ingrese la marca del Smartphone: ");
                            String marca = sc.nextLine();
                            newSmart.setMarca(marca);
                            System.out.println("Ingrese el sistema operativo: ");
                            String sistemaOperativo = sc.nextLine();
                            newSmart.setSistemaOperativo(sistemaOperativo);
                            System.out.println("Ingrese el nombre: ");
                            String nombre = sc.nextLine();
                            newSmart.setNombre(nombre);
                            System.out.println("Ingrese el precio: ");
                            double precio = Integer.parseInt(sc.nextLine());
                            newSmart.setPrecio(precio);
                            System.out.println("Ingrese el Stock donde se ubicara: ");
                            int stock = Integer.parseInt(sc.nextLine());
                            newSmart.setStock(stock);
                            agregarDispositivo(newSmart);
                            break;
                        }
                    case 3:
                        {
                            Tablet newTablet = new Tablet();
                            System.out.println("Ingrese la marca del Smartphone: ");
                            String marca = sc.nextLine();
                            newTablet.setMarca(marca);
                            System.out.println("Ingrese el sistema operativo: ");
                            double tamanoPantalla = sc.nextDouble();
                            newTablet.setTamanoPantalla(tamanoPantalla);
                            System.out.println("Ingrese el nombre: ");
                            String nombre = sc.nextLine();
                            newTablet.setNombre(nombre);
                            System.out.println("Ingrese el precio: ");
                            double precio = Integer.parseInt(sc.nextLine());
                            newTablet.setPrecio(precio);
                            System.out.println("Ingrese el Stock donde se ubicara: ");
                            int stock = Integer.parseInt(sc.nextLine());
                            newTablet.setStock(stock);
                            agregarDispositivo(newTablet);
                            break;
                        }
                    default:
                        System.out.println("Ingrese una opcion correcta");
                        break;
                }
            } else if (opc == 2) {
                mostrarInventario();
                System.out.println("El dispositivo que van comprar: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese la cantida: ");
                int cantidad = Integer.parseInt(sc.nextLine());
                venderDispositivo(nombre, cantidad);
            } else if(opc ==3){
                mostrarInventario();
            } else if(opc == 4){
                
            }else if (opc == 5){
                System.out.println("Total de dinero de todos los dispositivos: " + calcularValorTotalInventario());
            }
        }
    }

    public static void agregarDispositivo(DispositivoElectronico dispositivo) {
        inventario.add(dispositivo);
    }

    public static void venderDispositivo(String nombre, int cantidad) {

        mostrarInventario();
        System.out.println("El dispositivo que desea comprar: ");

        // int index sirve para identificar cual de la lista quieres editar
        int index = sc.nextInt();
        sc.nextLine();

        if (index < 0 || index >= inventario.size()) {
            System.out.println("Indice invalido");

            return; // pa terminar la ejecucion

        }

        DispositivoElectronico DispositivoElectronico = inventario.get(index);

        // Implementar
    }

    public static void mostrarInventario() {
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println(inventario.get(i).toString());

        }
        // Implementar
    }

    public static void aplicarDescuentoMarca(String marca, double porcentaje) {
        // Implementar
    }

    public static DispositivoElectronico buscarDispositivoMasCaro() {
        // Implementar
    }

    public static double calcularValorTotalInventario() {
        double suma = 0;
        for (int i = 0; i < inventario.size(); i++) {
            suma += inventario.get(i).precio;
            
        }
        return suma;
    }

}
