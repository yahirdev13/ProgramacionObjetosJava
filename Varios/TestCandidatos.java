package POO;

import java.util.Scanner;
public class TestCandidatos {
    public static void main(String[] args) {  
        //variables
        int opc,votosT;
        double porcentaje;
        Candidato candidato1;
        Candidato candidato2;
        Candidato candidato3;
        Scanner leer= new Scanner (System.in);
     
        System.out.println("Ingrese el nombre del primer candidato");
        candidato1 = new Candidato(leer.next());
        System.out.println("Ingrese el nombre del segundo candidato");
        candidato2 = new Candidato(leer.next());
        System.out.println("Ingrese el nombre del tercer candidato");
        candidato3 = new Candidato(leer.next());
        
        do {
            System.out.println("MENU \n1. Votar por " + candidato1.volvernombre() +  "\n2. Votar por " + candidato2.volvernombre() + "\n3. Votar por " + candidato3.volvernombre() + "\n4. Calcular ganador");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    candidato1.votoaumentado();
                    break;
                case 2:
                    candidato2.votoaumentado();
                    break;
                case 3:
                    candidato3.votoaumentado();
                    break;
                case 4:
                    
                    votosT = candidato1.votos + candidato2.votos + candidato3.votos;
                    
                    if(candidato1.votos > candidato2.votos && candidato1.votos > candidato3.votos){
                        porcentaje = (candidato1.votos * 100)/ votosT;
                        System.out.println("El candidato ganador es: " + candidato1.nombre + " con el " + porcentaje + "%");
                    }else if(candidato2.votos > candidato1.votos && candidato2.votos > candidato3.votos){
                        porcentaje = (candidato2.votos * 100)/ votosT;
                        System.out.println("El candidato ganador es: " + candidato2.nombre + " con el " + porcentaje + "%");                    
                    }else if(candidato3.votos > candidato2.votos && candidato3.votos > candidato1.votos) {
                        porcentaje = (candidato3.votos * 100)/ votosT;
                        System.out.println("El candidato ganador es: "+ candidato3.nombre + " con el " + porcentaje + "%");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opc != 4);    
    }  
}
