/*Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. */

import java.util.Scanner;

public class aula19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = teclado.nextInt();
        System.out.println("Digite o primeiro segundo: ");
        int n2 = teclado.nextInt();
        if(n1 == n2){
            System.out.println("Digite numeros diferentes");
        } else if (n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        } else {
            System.out.println(n2 + " é maior que " + n1);
        }
        teclado.close();

    }
}
