package Unidad2;
import java.util.Scanner;
public class Actividad4 {
    public static void main(String[] args) {    
        //Variables
        double a, b, c;
        int opc;
        Scanner leer= new Scanner (System.in);
        Formulas form= new Formulas (); //Metodo
        System.out.println("Menu calculadora:");
        System.out.println("1.Triangulo \n2.Cuadrado \n3.Circulo \n4.Salir");
        opc= leer.nextInt();
        if (opc >=0 && opc<=4){
            
            switch(opc){
                case 1:
                    System.out.println("Ingresa el primer valor: ");
                    a=leer.nextDouble();
                    System.out.println("Ingresa el segundo valor: ");
                    b=leer.nextDouble();
                    c= form.triangulo(a,b);
                    System.out.println("El area del triangulo es: "+c);
                    break;
                case 2:
                    System.out.println("Ingresa el valor del lado: ");
                    a=leer.nextDouble();
                    c= form.cuadrado(a);
                    System.out.println("El area del cuadrado es: "+c);
                    break;
                case 3:
                    System.out.println("Ingresa el valor del radio: ");
                    a=leer.nextDouble();
                    c= form.circulo(a);
                    System.out.println("El area del circulo es: "+c);
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

