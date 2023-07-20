package Expo1;
public class Verificar {
    boolean Verif(String a, String PASSWORD){
        Boolean test;
        if(a.equalsIgnoreCase(PASSWORD)){
            test=true;
        }else{
            test=false;
        }
        return test;      
    }
    
}
