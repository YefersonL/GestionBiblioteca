package gestionempleados;

import java.util.ArrayList;


public class Sistema {
    
     static ArrayList<Empleado> empleados;

    public static void main(String[] args) {
        
        empleados = new ArrayList<>();
        
        // Agregar empleados de prueba
        agregarEmpleado(new Vendedor("Ana", 2, 2000, 5));
        agregarEmpleado(new Vendedor("Luis", 3, 2500, 10));
        agregarEmpleado(new Gerente("Laura", 4, 3000, 500));

        // Realizar ventas para los vendedores
        Vendedor ana = (Vendedor) buscarEmpleado(2); // Método para buscar por id
        ana.realizarVenta(20);  // Ana realizó 20 ventas

        Vendedor luis = (Vendedor) buscarEmpleado(3);
        luis.realizarVenta(15);  // Luis realizó 15 ventas

        // Mostrar empleados
        System.out.println("Lista de empleados:");
        mostrarEmpleados();

        // Calcular nómina total mensual
        double totalNomina = calcularNominaTotalMensual();
        System.out.println("\nNómina total mensual: " + totalNomina);

        // Buscar empleado con mayor salario
        Empleado mayorSalario = buscarEmpleadoMayorSalario();
        System.out.println("\nEmpleado con mayor salario: " + mayorSalario);
    }

    public static void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public static void eliminarEmpleado(int id) {
        empleados.removeIf(empleado -> empleado.getId() == id);
    }

    public static void mostrarEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public static double calcularNominaTotalMensual() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularSalario();
        }
        return total;
    }

    public static Empleado buscarEmpleado(int id) {
        for (Empleado empleado : empleados) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null; // Si no se encuentra el empleado
    }

    public static Empleado buscarEmpleadoMayorSalario() {
        if (empleados.isEmpty()) {
            return null;
        }
        Empleado mayorSalario = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.calcularSalario() > mayorSalario.calcularSalario()) {
                mayorSalario = empleado;
            }
        }
        return mayorSalario;
    }
} 