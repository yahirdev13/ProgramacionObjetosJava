/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author RaúlDB
 */
public class ArregloEnteros {
    private int[] numeros;
    private int[] numRepetidos;
    private int[] posiciones;
    int controla, bandera = -1;

    public ArregloEnteros(int longitud) {
        numeros = new int[longitud];
        numRepetidos = new int [longitud];
        posiciones = new int [longitud];
    }

    public int getLongitud() {
        return numeros.length;
    }

    public void setNum(int indice, int numeros) {
        this.numeros[indice] = numeros;

    }

    public int getNum(int index) {
        return numeros[index];
    }

    public int buscarNum(int num) {
        for (int i = 0; i < getLongitud(); i++) {
            if (num == numeros[i]) {
                bandera = 0;
                controla = i;
            }
        }
        return bandera;
    }

    public int getControla() {
        return controla;
    }

    public void setControla(int controla) {
        this.controla = controla;
    }

}
