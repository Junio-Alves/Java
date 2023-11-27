package Classes.Banco;

import java.util.Scanner;

public class banco {
    private double saldo;
    Scanner teclado = new Scanner(System.in);
    void setarSaldo(){

        System.out.println("Digite o Valor a ser setado: ");
        this.saldo = teclado.nextDouble();
    }
    void depositar (){
        System.out.println("Digite o valor a ser depositado: ");
        this.saldo = saldo + teclado.nextDouble();
    }

    public void VerificarSaldo(){
        System.out.printf("O saldo atual é: R$%.2f", saldo);
    }




}
