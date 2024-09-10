/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionempleados;

/**
 *
 * @author renelobo
 */
class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, int id, double salarioBase, double bono) {
        super(nombre, id, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}