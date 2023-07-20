package Expo1;

public class CajeroA {
    double saldo=0;
    
    double Retirar(double x){
        saldo = saldo-x;
        return saldo;
    }
    double Depositar(double x){
        saldo=saldo+x;
        return saldo;
    }
    double Saldo(){
        return saldo;
    }
    void Salir(){
            
    } 
    
}
