package Expo1;
import java.util.Scanner;
public class Cajero {
    public static void main(String[] args) {
        //Variables
        String contra;
        int contador=0;
        boolean res=false;
        //Constante
        final String CONTRASENA="joviicam";
        //Vaiable
        int opc=0;
        double a=0, c=0;
        
        Scanner leer= new Scanner (System.in);
        Verificar pass= new Verificar ();
        CajeroA funcion= new CajeroA();
        
        while(contador<3){
            System.out.println("Ingresa la contrasena: ");
            contra = leer.next();
            res= pass.Verif(contra,CONTRASENA);            
            if(res==true){
                System.out.println(res);
                while(opc >=0 && opc<=4){
                    System.out.println("Menu");
                    System.out.println("1.Retirar\n2.Depositar\n3.Imprimir saldo\n4.Salir");
                    opc= leer.nextInt();           
                    switch(opc){
                        case 1:
                            System.out.println("Cuanto dinero deseas retirar: ");
                            a=leer.nextDouble();
                            c= funcion.Retirar(a);
                            System.out.println("Retiraste: "+a);
                            System.out.println("Tu saldo actual es de: $"+c);
                            break;
                        case 2:
                            System.out.println("Cuanto dinero vas a depositar: ");
                            a=leer.nextDouble();
                            c= funcion.Depositar(a);
                            System.out.println("Tu saldo actual es de: $"+c);
                            break;
                        case 3:                            
                            c=funcion.Saldo();
                            System.out.println("Tu saldo actual es de: $"+c);
                            break;
                        case 4:
                            opc=100;
                            funcion.Salir();
                            break;   
                        default:
                            System.out.println("Opcion incorrecta");
                    }                                 
                }
                break;
                    }else{
                        System.out.println("Contrasena incorrecta");
                        contador=contador+1;
                    }
        }
    }
    
}
