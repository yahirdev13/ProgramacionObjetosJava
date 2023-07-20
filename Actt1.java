
import java.util.Scanner;

public class Actt1 {
    public static void main(String[] args) {
        
        //variables
       String curp,curp2,cadena;
       char sexo;
       
        
       Scanner leer=new Scanner (System.in);
       
       System.out.println("Ingrese su curp hasta los 10 digitos");
       curp=leer.next();       
       
       System.out.println("Ingresa tu sexo: ");
       cadena = leer.next();
       sexo = cadena.charAt(0);

       
       curp2=curp.substring(0,4);
    
       System.out.println("Naciste el día "+curp.substring(8,10));
       System.out.println("En el mes "+curp.substring(6,8));
       System.out.println("del año "+curp.substring(4,6));

       
       System.out.println("4 caracteres: " + curp2.toLowerCase());  
       System.out.println("4 caracteres: " + curp2.toUpperCase());  
       
    
       System.out.println("Sexo:" + sexo);

    }
}


