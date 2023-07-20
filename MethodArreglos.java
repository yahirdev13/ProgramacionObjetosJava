package Unidad4;
public class MethodArreglos {
    private String[] nombres;
    private int longitud;

    public MethodArreglos(int longitud) {
        this.nombres = new String[longitud];
    }

    public void setNombre(String nombre, int index) {
        this.nombres[index] = nombre;
    }

    public String getNombre(int index) {
        return nombres[index];
    }

    public int getLongitud() {
        return nombres.length;
    }
    
    public void orden (){
        String temp;
        for (int i = 0; i < getLongitud(); i++) {
            for (int j = 0; j < getLongitud() - 1; j++) {
                if (getNombre(j).compareToIgnoreCase(getNombre(j + 1)) > 0) {
                    temp = getNombre(j + 1);
                    setNombre(getNombre(j), (j + 1));
                    setNombre(temp, j);
                }               
            }             
        }       
    }
}
