
package ExamenU3;

class Personas {
    private String clave;
    private String nombre;
    private int socio;
    private int pelicula;
    
     //Constructor
    Personas(String clave,String nombre, int entrada, int pelicula){
        this.clave = clave;
        this.nombre = nombre;
        this.socio = entrada;
        this.pelicula = pelicula;
        
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
    
    public int getPelicula(){
        return pelicula;
    }


    public int getSocio() {
        return socio;
    }

    public void setSocio(int socio) {
        this.socio = socio;
    }
}


