/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventariotienda;

/**
 *
 * @author renelobo
 */
class Smartphone extends DispositivoElectronico {
    private String sistemaOperativo;

    public Smartphone() {
    }

    

    public Smartphone(String nombre, String marca, double precio, int stock) {
        super(nombre, marca, precio, stock);
    }
    

    
    public void aplicarDescuento(double porcentaje) {
        this.precio -= this.precio * (porcentaje / 100);
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
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
        return "Smartphone{" + "sistemaOperativo = " + sistemaOperativo + ", nombre = " + super.nombre + ", marca = " + super.marca+ ", Precio = " + super.precio + " y Stock = "+ super.stock+'}';
    }
    
    
    
    
}
