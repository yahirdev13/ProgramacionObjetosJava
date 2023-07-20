package POO;

import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {    
        //Variables
        double x, z;
        int opc;
        Scanner leer= new Scanner (System.in);
        Procedimiento form= new Procedimiento (); //Metodo
        System.out.println("Calculador de Perimetro");
        System.out.println("Menu de Perimetros\n1.Triangulo \n2.Cuadrado \n3.Circulo \n4.Salir");
        opc= leer.nextInt();
        if (opc >=0 && opc<=4){
            switch(opc){
                case 1:
                    System.out.println("Ingresa el primer valor: ");
                    x=leer.nextDouble();
                    z= form.triangulo(x);
                    System.out.println("El perimetro del triangulo es: "+z);
                    break;
                case 2:
                    System.out.println("Ingresa el valor del lado: ");
                    x=leer.nextDouble();
                    z= form.cuadrado(x);
                    System.out.println("El perimetro del cuadrado es: "+z);
                    break;
                case 3:
                    System.out.println("Ingresa el valor del radio: ");
                    x=leer.nextDouble();
                    z= form.circulo(x);
                    System.out.println("El perimetro del circulo es: "+z);
                    break;
                case 4:
                    form.salir();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;                              
            }
        }
    }
}

        
        
    
