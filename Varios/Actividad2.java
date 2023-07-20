package Unidad2;
import java.util.Scanner;
public class Actividad2 {
    public static void main(String[] args) {
        
        String nombre1, apellido1, apellido2;
        String nombre2, apellido12, apellido22;
        String nombre3, apellido13, apellido23;
        int nombreComp1, nombreComp2, nombreComp3;
        String nombreC1, nombreC2, nombreC3;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el primer apellido");
        apellido1 = leer.next();
        System.out.println("Ingresa el segundo apellido");
        apellido2 = leer.next();
        System.out.println("Ingresa el nombre");
        nombre1 = leer.next();

        System.out.println("Ingresa el primer apellido");
        apellido12 = leer.next();
        System.out.println("Ingresa el segundo apellido");
        apellido22 = leer.next();
        System.out.println("Ingresa el nombre");
        nombre2 = leer.next();

        System.out.println("Ingresa el primer apellido");
        apellido13 = leer.next();
        System.out.println("Ingresa el segundo apellido");
        apellido23 = leer.next();
        System.out.println("Ingresa el nombre");
        nombre3 = leer.next();
        
        nombreC1=apellido1.concat(" " + apellido2 + " " + nombre1);
        nombreC2=apellido12.concat(" " + apellido22 + " " + nombre2);
        nombreC3=apellido13.concat(" " + apellido23 + " " + nombre3);

        System.out.println("Nombre completo: "+nombreC1);
        System.out.println("Nombre completo: "+nombreC2);
        System.out.println("Nombre completo: "+nombreC3);
        
        
        nombreComp1=nombreC1.compareTo(nombreC2);
        nombreComp2=nombreC2.compareTo(nombreC3);
        nombreComp3=nombreC3.compareTo(nombreC1);
        
        if(nombreComp1<nombreComp2 && nombreComp2<nombreComp3){
            System.out.println(nombreC1+"\n"+nombreC2+"\n"+nombreC3);
        }else if(nombreComp1<nombreComp2 && nombreComp2>nombreComp3){
            System.out.println(nombreC1+"\n"+nombreC3+"\n"+nombreC2);
        }else if(nombreComp1>nombreComp2 && nombreComp1<nombreComp3){
            System.out.println(nombreC2+"\n"+nombreC1+"\n"+nombreC3);
        }else if(nombreComp1>nombreComp2 && nombreComp1>nombreComp3 && nombreComp2<nombreComp3){
            System.out.println(nombreC2+"\n"+nombreC3+"\n"+nombreC1);
        }else if(nombreComp3<nombreComp1 && nombreComp1<nombreComp2){
            System.out.println(nombreC3+"\n"+nombreC1+"\n"+nombreC2);            
        }else{
            System.out.println(nombreC3+"\n"+nombreC2+"\n"+nombreC1);
        }      
    }
}
