
package Tareas;

public class verificar_1{
    final String PASSWORD = "diazgonzalezyahiralberto";
     boolean verificarPassword(String contra){
        boolean test;
        if (contra.equals(PASSWORD)){
            test= true;           
        }else{
            test= false;
        }
        return test;
    }
}
 