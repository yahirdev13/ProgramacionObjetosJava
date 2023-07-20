package perimetros;
import java.util.Scanner;

public class Arreglos2 {
    public static void main(String[] args) {
        //Variables
        
        double [] array= new double [6];
        double prom, suma=0;
        int i;
        Scanner leer = new Scanner(System.in);
        
        for (i=2; i<array.length; i++){
            System.out.println("Ingresa la calificacion del parcial: ");
            array[i] = leer.nextDouble();
            suma= suma+ array[i];
        }
        prom= suma/4;
        array[5]=prom;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Tus calificaciones son: "+array[i]);
            
        }
        System.out.println("Tu promedio final es de: "+prom);
        
    }
    
}
