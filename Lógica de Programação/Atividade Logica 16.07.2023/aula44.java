/* Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido
um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado
da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA). */

import java.util.Scanner;

public class aula44 {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o primeiro numero: ");
        n1 = teclado.nextInt();
        boolean repita = true;
        while (repita) {
            System.out.printf("Digite o segundo numero: ");
            n2 = teclado.nextInt();
            if(n2 != 0){
                repita = false;
                double divisão = n1/n2;
                System.out.printf("A divisão de %d por %d é: %.2f", n1,n2,divisão );
            } else {
                System.out.println("Digite um numero diferente de 0!");
            }
        }
        teclado.close();
    }
}
