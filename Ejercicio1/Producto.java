package Taller6.Ejercicio1;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public void detallesProducto(){
        System.out.println("Nombre del Producto: "+nombre+", Precio: "+precio);
    }
}
