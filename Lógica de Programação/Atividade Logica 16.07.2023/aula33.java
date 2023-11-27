/*Ler dois valores e imprimir uma das três mensagens a seguir:
‘Números iguais’, caso os números sejam iguais
‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
‘Segundo maior’, caso o segundo seja maior que o primeiro. */

import java.util.Scanner;

public class aula33 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.printf("Digite o primeiro valor: ");
         int n1 = teclado.nextInt();
         System.out.printf("Digite o segundo valor: ");
         int n2 = teclado.nextInt();
         teclado.close();
         if(n1 == n2){
            System.out.println("Números iguais.");
         } else if (n1 > n2){
            System.out.println("Primeiro é maior.");
         } else {
            System.out.println("O segundo é maior.");
         }
    }
}
