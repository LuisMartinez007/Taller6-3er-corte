package Taller6.Ejercicio3;

public class PruebaThis { 
    
    private String mensaje; 
    
    public PruebaThis(String mensaje) { 
        this.mensaje = mensaje;
    
    } 

    public void mostrarMensaje() { 
        System.out.println(this.mensaje); 
    } 

    // Método estático 
    public static void metodoEstatico(PruebaThis instancia) {
         System.out.println(instancia.mensaje);
    }

    public static void main(String[] args) { 

            PruebaThis prueba = new PruebaThis("Hola, mundo!");
            PruebaThis.metodoEstatico(prueba); 
             prueba.mostrarMensaje();
    }
}