/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package ejerciciocurp;

import java.util.Scanner;

/**
 *
 * @author CC10
 */
public class EjercicioCurp {

    /**
     * @param args the command line arguments
     */
    //DOBR031012M
    //012345678910
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String curp, day, month, year, identificador, cad;
        char sex;

        System.out.println("Ingresa tu curp");
        curp = leer.next();
        System.out.println("Ingresa tu sexo: ");
        cad = leer.next();
        sex = cad.charAt(0);

        while (curp.length() != 10) {
            System.out.println("Solo se permiten 10 caracteres");
            System.out.println("Ingresalo otra vez:)\n");
            curp = leer.next();
        }

        day = curp.substring(8);
        System.out.println("Naciste el día: " + day);
        month = curp.substring(6, 8);
        System.out.println("del mes: " + month);
        year = curp.substring(4, 6);
        System.out.println("En el año: " + year);

        identificador = curp.substring(0, 4);
        System.out.println("Identificador: " + identificador.toUpperCase() + " " + identificador.toLowerCase());
        identificador = curp.substring(0, 4);       
        System.out.println("Sexo:" + sex);

    }

}
