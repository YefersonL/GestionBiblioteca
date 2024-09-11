/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariotienda;


public class Tablet extends DispositivoElectronico{
    double tamanoPantalla;

    public Tablet(double tamanoPantalla, String nombre, String marca, double precio, int stock) {
        super(nombre, marca, precio, stock);
        this.tamanoPantalla = tamanoPantalla;
    }

    public Tablet() {
    }
    

    public Tablet(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }
    
     public void setStock(int stock) {
        this.stock = stock;
    }
    

    @Override
    public String toString() {
        return "Tablet{" + "tamanoPantalla = " + tamanoPantalla + ", nombre = " + super.nombre + ", marca = " + super.marca+ ", Precio = " + super.precio + " y Stock = "+ super.stock + '}';
    }
    

   
    
    
    
    
}
