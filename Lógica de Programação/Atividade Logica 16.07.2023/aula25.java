/* Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e
escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior
ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. */

import java.util.Scanner;

public class aula25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o numero da sua conta: ");
        int n_conta = teclado.nextInt();
        System.out.printf("Digite o saldo da sua conta: ");
        double saldo = teclado.nextDouble();
        System.out.printf("Digite o credito da sua conta: ");
        double credito = teclado.nextDouble();
        System.out.printf("Digite o débido da sua conta: ");
        double debito = teclado.nextDouble();
        teclado.close();
        double saldo_atual = saldo - debito + credito;
        System.out.println("O saldo atual da sua conta é: R$" + saldo_atual);
        if(saldo_atual >= 0){
            System.out.println("Saldo é positivo!");
        } else {
            System.out.println("Saldo é negativo!");
        }
        
    }
}
