package unidad2;
import java.util.Scanner;
public class Actividad5 {
    public static void main(String[] args) {
        //Variables
        String contra;
        int contador=0;
        boolean res=false;
        //Constante
        final String CONTRASENA="joviicam";
        
        Scanner leer= new Scanner (System.in);
        Contrasena pass= new Contrasena ();
        
        while(contador<3){
            System.out.println("Ingresa la contrasena: ");
            contra = leer.next();
            res= pass.Verif(contra,CONTRASENA);            
            if(res==true){
                System.out.println(res);
                break;
            }else{
                System.out.println("Contrasena incorrecta");
                contador=contador+1;
            }
        }
    }
    
}
