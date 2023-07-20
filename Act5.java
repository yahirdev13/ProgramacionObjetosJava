package POO;
import java.util.Scanner;
public class Act5 {
    public static void main(String[] args) {
        //Variables
        String password;
        int contador=0;
        boolean respuesta=false;
        //Constante
        final String PASSWORD="y@HIR1310";
        
        Scanner leer= new Scanner (System.in);
        Contrasena pass= new Contrasena ();
        
        while(contador<3){
            System.out.println("Ingresa la contrasena: ");
            password = leer.next();
            respuesta= pass.Verif(password,PASSWORD);            
            if(respuesta==true){
                System.out.println(respuesta);
                break;
            }else{
                System.out.println("Contrasena incorrecta, vuelva a intentar");
                contador=contador+1;
            }
        }
    }
    
}

