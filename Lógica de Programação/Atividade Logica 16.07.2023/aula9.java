//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//Calcular e escrever o valor do novo salário.

import java.util.Scanner;

public class aula9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite seu salario atual: R$");

        double salario = teclado.nextInt();
        System.out.printf("Digite o percentual de reajuste: ");
        double percentual = teclado.nextInt();
        double salario_reajustado = ((percentual / 100) + 1)  * salario;
        System.out.printf("Seu salario reajustado é: " + salario_reajustado);
        teclado.close();
        

    }
}
