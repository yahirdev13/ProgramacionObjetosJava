package clases;

import java.util.Scanner;

public class PromedioDeDosGrupos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        int[] promGrupo1 = new int[5];
        int[] promGrupo2 = new int[5];
        int[] promMasAlto = new int[5];

        System.out.println("---------- Grupo 1 ----------");
        for (int i = 0; i < promGrupo1.length; i++) {
            System.out.println("Escribe el promedio #" + (i + 1) + ":");
            promGrupo1[i] = in.nextInt();
        }

        System.out.println("\n---------- Grupo 2 ----------");
        for (int i = 0; i < promGrupo2.length; i++) {
            System.out.println("Escribe el promedio #" + (i + 1) + ":");
            promGrupo2[i] = in.nextInt();
        }

        for (int i = 0; i < promMasAlto.length; i++) {
            if (promGrupo1[i] > promGrupo2[i]) {
                promMasAlto[i] = promGrupo1[i];
            } else {
                promMasAlto[i] = promGrupo2[i];
            }
        }

        for (int i = 0; i < promMasAlto.length; i++) {
            System.out.println("El promedio en la posición " + (i + 1) + " más alto es " + promMasAlto[i]);
        }
    }
}
