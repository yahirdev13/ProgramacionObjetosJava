package Tareas;

import java.util.Scanner;
public class Promedios {
    public static void main(String[] args) {  
        //Arrays
        double [] promedios1 = new double [5];
        double [] promedios2 = new double [5];
        double [] promediosAltos = new double [5];
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese calificaciones del grupo 1");
        for (int i = 0; i < promedios1.length; i++){
            System.out.println("Ingrese el " + (i + 1) + " promedio:");
            promedios1[i] = leer.nextInt();
        }
        
        System.out.println("Ingrese calificaciones del grupo 2");
        for (int i = 0; i < promedios2.length; i++){
            System.out.println("Ingrese el " + (i + 1) + " promedio:");
            promedios2[i] = leer.nextInt();
        }
        
        for (int i = 0; i < promediosAltos.length; i++) {
            if (promedios1[i] > promedios2[i]) {
                promediosAltos[i] = promedios1[i];
            } else {
                promediosAltos[i] = promedios2[i];
            }
        }
        
        for (int i = 0; i < promediosAltos.length; i++) {
            System.out.println("El mejor promedio en la posicion " + (i + 1) + " es: " + promediosAltos[i]);
        }    
    }
}
