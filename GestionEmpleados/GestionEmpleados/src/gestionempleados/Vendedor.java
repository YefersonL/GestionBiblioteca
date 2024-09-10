package gestionempleados;


class Vendedor extends Empleado {
    private double comision;
    private int ventas;

    public Vendedor(String nombre, int id, double salarioBase, double comision) {
        super(nombre, id, salarioBase);
        this.comision = comision;
        this.ventas = 0;
    }

    public void realizarVenta(int cantidad) {
        this.ventas += cantidad;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (comision * ventas);
    }
}