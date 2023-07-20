/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre;

/**
 *
 * @author RaúlDB
 */
import java.util.Scanner;

public class Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre, apellidoPat, apellidoMat;
        String nombreSP, apellidoSPat, apellidoSMat;
        String nombreTP, apellidoTPat, apellidoTMat;
        String nombreComp1 = "", nombreComp2 = "", nombreComp3 = "";

        System.out.println("Ingresa nombre de la persona 1:");
        nombre = leer.next();
        System.out.println("Ingresa apellido paterno de la persona 1:");
        apellidoPat = leer.next();
        System.out.println("Ingresa apellido materno de la persona 1:");
        apellidoMat = leer.next();

        System.out.println("Ingresa nombre de la persona 2:");
        nombreSP = leer.next();
        System.out.println("Ingresa apellido paterno de la persona 2:");
        apellidoSPat = leer.next();
        System.out.println("Ingresa apellido materno de la persona 2:");
        apellidoSMat = leer.next();

        System.out.println("Ingresa nombre de la persona 3:");
        nombreTP = leer.next();
        System.out.println("Ingresa apellido paterno de la persona 3:");
        apellidoTPat = leer.next();
        System.out.println("Ingresa apellido materno de la persona 3:");
        apellidoTMat = leer.next();
        
        System.out.println("Nombre completo: "+nombreComp1.concat(nombre+ " " + apellidoPat+ " "+ apellidoMat));
        System.out.println("Nombre completo: "+nombreComp2.concat(nombreSP+ " " + apellidoSPat+ " "+ apellidoSMat));
        System.out.println("Nombre completo: "+nombreComp3.concat(nombreTP+ " " + apellidoTPat+ " "+ apellidoTMat));
        
        
    }
}
