import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        
        String nombre1, apellidoPat1, apellidoMat1;
        String nombre2, apellidoPat2, apellidoMat2;
        String nombre3, apellidoPat3, apellidoMat3;
        String nombresp1 = " ", nombresp2 = " ", nombresp3 = " ";
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa nombre de la primera persona");
        nombre1 = leer.next();
        System.out.println("Ingresa apellido de la primera persona");
        apellidoPat1 = leer.next();
        System.out.println("Ingresa apellido materno de la primera persona");
        apellidoMat1 = leer.next();

        System.out.println("Ingresa nombre de la segunda persona");
        nombre2 = leer.next();
        System.out.println("Ingresa apellido paterno de la segunda persona");
        apellidoPat2 = leer.next();
        System.out.println("Ingresa apellido materno de la segunda persona");
        apellidoMat2 = leer.next();

        System.out.println("Ingresa nombre de la tercera persona");
        nombre3 = leer.next();
        System.out.println("Ingresa apellido paterno de la tercera persona");
        apellidoPat3 = leer.next();
        System.out.println("Ingresa apellido materno de la tercera persona");
        apellidoMat3 = leer.next();

        System.out.println("Nombre completo: "+nombresp1.concat(nombre1+ " " + apellidoPat1 + " " + apellidoMat1));
        System.out.println("Nombre completo: "+nombresp2.concat(nombre2+ " " + apellidoPat2 + " " + apellidoMat2));
        System.out.println("Nombre completo: "+nombresp3.concat(nombre3+ " " + apellidoPat3 + " " + apellidoMat3));
    }
}
