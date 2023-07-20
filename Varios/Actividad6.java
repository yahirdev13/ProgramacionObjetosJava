package unidad2;
import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
        //Variables:
        String nombre, sexo;
        int edad, edoCivil;
        char sexo1;
        double estatura;
        boolean estadoCivil;
        Scanner leer=new Scanner (System.in);
        Registro datos= new Registro (); //Metodo
        
        System.out.println("Ingresa tu nombre: ");
        nombre= leer.next();
        System.out.println("Ingresa tu edad: ");
        edad=leer.nextInt();
        System.out.println("Ingresa tu estatura: ");
        estatura=leer.nextDouble();
        System.out.println("Inglesa tu sexo: 1. Hombre 2. Mujer");
        sexo=leer.next();
        sexo1=sexo.charAt(0);
        System.out.println("Estado civil: 1.- Casado o 2.- Soltero");
        edoCivil=leer.nextInt();
        estadoCivil= datos.inicializacion1(edoCivil);
        
        
        
    }
    
}
