package Unidad3;
import java.util.Scanner;

public class ArregloIngresos {
    public static void main(String[] args) {
        //Variables
        double ingresosT = 0;
        double [] array = new double [99]; //array.length=99;
        int i;
        Scanner leer = new Scanner(System.in);
        
        for (i = 0; i < array.length; i++){
            System.out.println("Venta realizada a los clientes: " ); 
            array[i] = leer.nextDouble();           
            ingresosT += array[i];
        }
        System.out.println("El ingreso total total es de: " + ingresosT);       
    }
}
