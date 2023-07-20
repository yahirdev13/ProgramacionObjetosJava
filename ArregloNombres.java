package Unidad4;

public class ArregloNombres {

    private String[] nombres;
    private String[] claves;
    private int[] edades;
    private double[] estaturas;
    private int[] arreglo;
    private int longitud, sig;

    public ArregloNombres(int longitud) {
        this.claves = new String[longitud];
        this.nombres = new String[longitud];
        this.edades = new int[longitud];
        this.estaturas = new double[longitud];
        this.arreglo = new int[longitud];
    }

    public void setNombre(String nombre, int index) {
        this.nombres[index] = nombre;
    }

    public String getNombre(int index) {
        return nombres[index];
    }

    public void setClave(String clave, int index) {
        this.claves[index] = clave;
    }

    public String getClave(int index) {
        return claves[index];
    }

    public void setEdad(int edad, int index) {
        this.edades[index] = edad;
    }

    public int getEdad(int index) {
        return edades[index];
    }

    public void setEstatura(double estatura, int index) {
        this.estaturas[index] = estatura;
    }

    public double getEstatura(int index) {
        return estaturas[index];
    }

    public int getLongitud() {
        return nombres.length;
    }

    public int getSig() {
        return sig;
    }

    public void setSig(int siguiente) {
        sig = siguiente;
    }

    public void altaNumero(int numero) {
        arreglo[sig] = numero;
        sig++;
    }

    public int buscadorNum(String verifClave) {
        for (int i = 0; i < getLongitud(); i++) {
            if (verifClave.equals(claves[i])) {
                return i;
            }
        }
        return -1;
    }

    public void eliminar(String borrarClave) {
        for (int i = 0; i < sig - 1; i++) {
            if (borrarClave.equals(claves[i])) {
                claves[i] = claves[i + 1];
                nombres[i] = nombres[i + 1];
                edades[i] = edades[i + 1];
                estaturas[i] = estaturas[i + 1];
            }
        }
        sig--;
        claves[sig] = null;
        nombres[sig] = null;
        edades[sig] = 0;
        estaturas[sig] = 0;
        
    }
}
