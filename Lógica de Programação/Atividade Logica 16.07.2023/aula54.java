/* Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere
que o N será sempre maior que ZERO. */

import java.util.Scanner;

public class aula54 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a quantidade: ");
        int n = teclado.nextInt();
        for(int i = 1; i <= n ; i++){
            System.out.println(i);
        }
        teclado.close();
    }
}
