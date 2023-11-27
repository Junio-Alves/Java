/* Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
compra'. */

import java.util.Scanner;

public class aula26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a quantidade atual do estoque: ");
        double estoque = teclado.nextDouble();
        System.out.printf("Digite a quantidade maxima do estoque: ");
        double estoque_maxima = teclado.nextDouble();
        System.out.printf("Digite a quantidade minima do estoque: ");
        double estoque_minima = teclado.nextDouble();
        teclado.close();
        double media_estoque = (estoque_maxima + estoque_minima)/2;
        System.out.println("A media do estoque é: " + media_estoque);
        if(media_estoque >= estoque){
            System.out.println("Não efetuar compra!");
        } else {
            System.out.println("Efetuar compra!");
        }

    }
}
