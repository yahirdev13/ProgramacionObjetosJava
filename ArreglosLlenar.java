package Unidad4;
import java.util.Scanner;
public class ArreglosLlenar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");       
        //int longitud;
        System.out.println("Cuantos nombres vas a ingresar: ");
        MethodArreglos array = new MethodArreglos(leer.nextInt());
        /**
         * ES LO MISMO QUE: longitud=leer.nextInt(); Eje1Metod array []= new Array[longitud];
         * 
         */
        for (int i = 0; i < array.getLongitud(); i++) {
            System.out.println("Ingrese el Nombre "+(i+1));
            array.setNombre(leer.next(), i);
        }      
        System.out.println("\nIMPRIMIR NOMBRES:\n");
        array.orden();
        for (int i = 0; i < array.getLongitud(); i++) {
            System.out.println(array.getNombre(i));           
        }      
        
    }

}
