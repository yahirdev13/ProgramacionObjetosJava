package POO;
class Candidato {
    String nombre;
    int votos;
    
    Candidato(String nombre) {
        this.nombre = nombre;
    }
    
    public void votoaumentado(){
        votos++;
    }
    
    public String volvernombre(){
        return this.nombre;
    }
}
