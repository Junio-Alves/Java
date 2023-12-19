/* Escreva um algoritmo para ler 10 números e ao final da leitura escrever a soma total dos 10
números lidos. */

import java.util.Scanner;

public class aula63 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int media = 0;
        for(int i = 1; i <= 10; i++){
            System.out.printf("Digite o %dº numero: ",i);
            int n = teclado.nextInt();
            media = media + n;
        }
        teclado.close();
        System.out.println("A soma total dos 10 numeros é: " + media);
    }
}
