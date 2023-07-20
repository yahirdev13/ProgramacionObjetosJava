package ArregloDeObjetos;
class Array {
    private Personas[]arreglo;
    private int siguiente;
    //constructor
    Array(int longitud) {
        arreglo=new Personas[longitud];
    }
    
    void registro(int index,String clave,String nombre,int edad,double estatura){
        arreglo[index]=new Personas(clave,nombre,edad,estatura);
    }   
    int longitud(){
        return arreglo.length;
    }
    int getSig(){
        return siguiente;
    }
    public Personas getPersona(int index){
        return arreglo[index];
    }
    
    void contador(){
        siguiente++;
    }
    
    int busqueda(String buscar) {
        int aux = -1;
        for (int i = 0; i < siguiente; i++) {
            if (buscar.equals(arreglo[i].getClave())) {
                aux = i;
                break;
            }
        }
        return aux;
    }
   
    void eliminar(int index) {
        for (int i = index; i < siguiente-1; i++) {
            arreglo[i] = arreglo[i+1];
        }
        siguiente--;
    }
}
