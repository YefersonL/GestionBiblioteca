package gestionempleados;

abstract class Empleado {
    protected String nombre;
    protected int id;
    protected double salarioBase;

    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + ", ID: " + id + ", Salario Base: " + salarioBase;
    }
}