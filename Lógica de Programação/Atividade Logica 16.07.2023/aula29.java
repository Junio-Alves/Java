/*Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
maiores. */

import java.util.Scanner;
public class aula29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o primeiro valor: ");
        int n1 = teclado.nextInt();
        System.out.printf("Digite o segundo valor: ");
        int n2 = teclado.nextInt();
        System.out.printf("Digite o terceiro valor: ");
        int n3 = teclado.nextInt();
        teclado.close();
        if(n1 > n2){
            //n1 maior
            if(n2>n3){
                //n1 + n2
                System.out.println("A soma dos dois maiores são: " + (n1 + n2));
            } else {
                //n1 + n3
                System.out.println("A soma dos dois maiores são: " + (n1 + n3));
            }
        } else {
            if(n2>n3){
                //n2 maior
                 System.out.println("A soma dos dois maiores são: " + (n2 + n3));
            } else {
                System.out.println("A soma dos dois maiores são: " + (n3 + n2));
            }
        }

    }
}
