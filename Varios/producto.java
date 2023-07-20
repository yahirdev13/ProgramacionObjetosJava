package Tareas;

public class producto {

    private String nombre;
    private double precio;
    private int existencia;
    
    public producto(String nombre, double precio, int existencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getExistencia() {
        return existencia;
    }
    
     public double getPrecio() {
        return precio;
    }

    public void disminuirExistencia(int cantidad) {
        existencia -= cantidad;
    }
   
    public void aumentarExistencia(int cantidad) {
        existencia += cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
