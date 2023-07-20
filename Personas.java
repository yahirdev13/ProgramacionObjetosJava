package ArregloDeObjetos;
class Personas {
    private String clave;
    private String nombre;
    private int edad;
    private double estatura;
    
    Personas(String clave,String nombre,int edad,double estatura){
        this.clave = clave;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
      
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
}
