package org.example;

public class Cuenta {

    private int saldo;

    public Cuenta(){ //Este constructor para la cuenta abierta sin monto
        this.saldo = 0;
    }

    public Cuenta(int saldoiniciado){ //Aca coloque el constructor para cuando hay saldo inicial
        this.saldo = saldoiniciado;
    }

    //Depositar dinero
    public void deposito(int monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito completado");
            System.out.println("El nuevo saldo es: $" + saldo);
        } else {
            System.out.println("Monto Erroneo, verifique nuevamente el monto");
        }
    }

    //Retirar dinero
    public void retiro(int monto){
        if (monto > 0){
            if (monto <= saldo){
                saldo -= monto;
                System.out.println("Retiro Exitoso");
                System.out.println("El nuevo saldo es: $" + saldo);

            }else{
                System.out.println("Fondo insuficiente");
            }
        }else{
            System.out.println("Monto Erroneo, verifique nuevamente el monto");
        }
    }

    //Obtener Saldo
    public int getSaldo(){
        return saldo;
    }

}