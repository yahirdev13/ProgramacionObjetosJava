package Tareas;

public class ExamenArreglos {

    private String[] clave;
    private int[] existencias;
    private double[] precio;
    private int[] tipo;

    ExamenArreglos(int longitud) {
        clave = new String[longitud];
        existencias = new int[longitud];
        precio = new double[longitud];
        tipo = new int[longitud];

    }

    public int getLongitud() {
        return clave.length;
    }

    public void setClave(String nombre, int index) {
        this.clave[index] = nombre;
    }

    public void setExistencias(int existencias, int index) {
        this.existencias[index] = existencias;
    }

    public void setPrecio(double precio, int index) {
        this.precio[index] = precio;
    }

    public void setTipo(int tipo, int index) {
        this.tipo[index] = tipo;
    }
    
    public String getClave(int index) {
        return clave[index];
    }
    
     public double getPrecio(int index) {
        return precio[index];
    }
     
     public int getExistencias(int index) {
        return existencias[index];
    }
}
