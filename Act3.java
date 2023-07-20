package POO;

import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {    
        //Variables
        double x, y, z;
        int opc;
        Scanner leer= new Scanner (System.in);
        Calculo form= new Calculo (); //Metodo
        System.out.println("Calculador de Perimetro");
        System.out.println("Menu de Perimetros\n1. Suma \n2. Resta \n3. Multiplicacion \n4. Division \n5. Salir");
        opc= leer.nextInt();
        if (opc >=0 && opc<=4){
            switch(opc){
                case 1:
                    System.out.println("Ingresa el primer valor: ");
                    x=leer.nextDouble();
                    System.out.println("Ingresa el segundo valor: ");
                    y=leer.nextDouble();
                    z= form.suma(x,y);
                    System.out.println("El resultado es: "+z);
                    break;
                case 2:
                    System.out.println("Ingresa el primer valor: ");
                    x=leer.nextDouble();
                    System.out.println("Ingresa el segundo valor: ");
                    y=leer.nextDouble();
                    z= form.resta(x,y);
                    System.out.println("El resultado es: "+z);
                    break;
                case 3:
                    System.out.println("Ingresa el primer valor: ");
                    x=leer.nextDouble();
                    System.out.println("Ingresa el segundo valor: ");
                    y=leer.nextDouble();
                    z= form.multiplicacion(x,y);
                    System.out.println("El resultado es: "+z);
                    break;
                case 4:
                    System.out.println("Ingresa el primer valor: ");
                    x=leer.nextDouble();
                    System.out.println("Ingresa el segundo valor: ");
                    y=leer.nextDouble();
                    z= form.division(x,y);
                    System.out.println("El resultado es: "+z);
                    break;
                case 5:
                    form.salir();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;                              
            }
        }
    }
}

        
        
    
