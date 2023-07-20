/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RaúlDB
 */
public class BusquedaEntero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArregloEnteros arr;
        int longitud, opc, numLect, buscNum, aux, i = 0;
        System.out.println("Ingresa cuantos números vas a registrar: ");
        longitud = leer.nextInt();
        arr = new ArregloEnteros(longitud);
        do {
            System.out.println("1.-Alta de un número\n2.-Buscar número\n3.-Imprimir los números.\n4.-Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    if(i < longitud){
                    System.out.println("****ALTA NÚMERO****");
                    
                        System.out.println("Ingresa un número");
                        numLect = leer.nextInt();
                        arr.setNum(i, numLect);
                        i++;
                    } else {
                        System.out.println("****Ya no hay espacios****");
                    }
                    break;
                case 2:
                    System.out.println("***BUSCAR NÚMERO***");
                    System.out.println("Ingresa el número que desea encontrar: ");
                    buscNum = leer.nextInt();
                    aux = arr.buscarNum(buscNum);
                    if (aux != -1) {
                        System.out.println("El número es: " + arr.getNum(arr.getControla()) + " Y está en la posición: " + arr.getControla());
                    } else {
                        System.out.println("Número no encontrado ");
                    }
                    break;
                case 3:
                    System.out.println("***IMPRIMIR NÚMEROS GUARDADOS***");
                    for (int j = 0; j < arr.getLongitud(); j++) {
                        System.out.println("El número #" + (j + 1) + " es: " + arr.getNum(j));
                    }
                    break;
                case 4:
                    System.out.println("Cerrando sistemaaaaaas.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opción no disponible intentalo otra vez");
            }
        } while (opc != 4);

    }

}
