package clases;

import java.util.Scanner;

public class TestCandidatos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Candidato candidato1;
        Candidato candidato2;
        Candidato candidato3;                       
        int opc;
        String ganador;
        leer.useDelimiter("\n");
        int porcentajeVotos, totalVotos;
        
        System.out.println("Escribe el nombre del primer candidato:");
        candidato1 = new Candidato(leer.next());
        System.out.println("Escribe el nombre del segundo candidato:");
        candidato2 = new Candidato(leer.next());
        System.out.println("Escribe el nombre del tercer candidato:");
        candidato3 = new Candidato(leer.next());
        
        do {
            System.out.println("MenÃº\n\"Seleccion de presidente municipalo\"");
            System.out.println("1.-Candidato: " + candidato1.regresarNombre() + "\n2.-Candidato: " + candidato2.regresarNombre() + "\n3.-Candidato: " + candidato3.regresarNombre() + "\n4.-Calcular ganador");
            opc = leer.nextInt();
            switch(opc){
                
                case 1:
                    candidato1.aumentarVoto();
                    break;
                case 2:    
                    candidato2.aumentarVoto();
                    break;
                case 3:   
                    candidato3.aumentarVoto();
                    break;
                case 4:    
                    totalVotos = candidato1.numeroVotos + candidato2.numeroVotos + candidato3.numeroVotos;
                    if(candidato1.numeroVotos > candidato2.numeroVotos && candidato1.numeroVotos > candidato3.numeroVotos){
                        porcentajeVotos = (candidato1.numeroVotos / totalVotos)* 100;
                        System.out.println("El ganador es: " + candidato1.nombre + " con un porcentaje de %" + porcentajeVotos);
                    }else if(candidato2.numeroVotos > candidato1.numeroVotos && candidato2.numeroVotos > candidato3.numeroVotos){
                        porcentajeVotos = (candidato2.numeroVotos / totalVotos)* 100;
                        System.out.println("El ganador es: " + candidato2.nombre + " con un porcentaje de %" + porcentajeVotos);                    
                    }else if(candidato3.numeroVotos > candidato2.numeroVotos && candidato3.numeroVotos > candidato1.numeroVotos) {
                        porcentajeVotos = (candidato3.numeroVotos / totalVotos)* 100;
                        System.out.println("El ganador es: "+ candidato3.nombre + " con un porcentaje de %" + porcentajeVotos);
                    }
                    break;
                default:           
                    System.out.println("Error, numero erroneo");
            }
        } while (opc != 4);
        
    }
}
