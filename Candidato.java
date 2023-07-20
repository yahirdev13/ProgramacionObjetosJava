package clases;
public class Candidato {
    String nombre;
    int numeroVotos;
    
    Candidato(String nombre){
        this.nombre = nombre;
    }
    
    public void aumentarVoto(){
        numeroVotos++;
    }
    
    public String regresarNombre(){        
        return this.nombre;
    }
}
