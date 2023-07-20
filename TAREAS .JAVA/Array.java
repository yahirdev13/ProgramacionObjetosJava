package ExamenU3;

class Array {

    private Personas[] arreglo;
    private int siguiente;
    private int sociosT1;
    private int sociosT2;

    //constructor
    Array(int longitud, int tipo1, int tipo2) {
        arreglo = new Personas[longitud];
        this.sociosT1 = tipo1;
        this.sociosT2 = tipo2;
    }

    //SETS
    void registro(int index, String clave, String nombre, int socio, int pelicula) {
        arreglo[index] = new Personas(clave, nombre, socio, pelicula);
    }


    int longitud() {
        return arreglo.length;
    }

    int getSig() {
        return siguiente;
    }

    public int getSociosT1() {
        return sociosT1;
    }

    public int getSociosT2() {
        return sociosT2;
    }

    //METODOS
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

    void contador() {
        siguiente++;
    }

    void MenosSociosNormales() {
        this.sociosT1--;
    }

    public Personas getPersona(int index) {
        return arreglo[index];
    }

     void eliminacion(int index) {
        for (int i = index; i < siguiente-1; i++) {
            arreglo[i] = arreglo[i+1];
        }
        siguiente--;
    }
        void menoscontador(){
        siguiente--;
        }
        
        void masSociosT1() {
        this.sociosT1++;
    }
    
        void MasSociosT2() {
        this.sociosT2++;
    }
}
