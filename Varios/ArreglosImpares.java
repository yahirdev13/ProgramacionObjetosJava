package Unidad3;
import java.util.Scanner;
public class ArreglosImpares {
    public static void main(String[] args) {
        //Variables
        double [] array = new double [20];
        double [] arrayPar = new double [20]; //array.length=19;
        double [] arrayImpar = new double [20];
        int i, a = 0, b = 0;
        Scanner leer = new Scanner(System.in);
        
        for (i = 0; i<array.length; i++){           
            System.out.println("Ingresa el numero: ");
            array[i] = leer.nextDouble();
            if (array[i]%2 == 0) {
                arrayPar[a]= array[i];    
                a++;
            }else{
                arrayImpar[b]= array[i];
                b++;
            } 
        }
        System.out.println("Numeros pares: ");
        for (int k = 0; k < arrayPar.length; k++) {                       
            if(arrayPar[k]>0){
                System.out.println(arrayPar[k]);
            }           
        }
        System.out.println("Numeros impares: ");
        for (int k = 0; k < arrayImpar.length; k++) {
            if(arrayImpar[k]>0){
                System.out.println(arrayImpar[k]);
            }             
        }              
    }
}
