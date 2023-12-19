/* Ler 10 valores, calcular e escrever a média aritmética desses valores lidos. */

import java.util.Scanner;

public class aula61 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int media = 0;
        for(int i = 1; i <= 10; i++){
            System.out.printf("Digite o %dº valor: ", i);
            int valor = teclado.nextInt();
            media = media + valor;
        }
        media = media/10;
        teclado.close();
        System.out.println("A media aritmética é: " + media);
    }
}
