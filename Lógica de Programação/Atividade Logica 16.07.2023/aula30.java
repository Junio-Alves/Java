/*
 * 
 */

import java.util.Scanner;

public class aula30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o primeiro valor: ");
        int n1 = teclado.nextInt();
        System.out.printf("Digite o segundo valor: ");
        int n2 = teclado.nextInt();
        System.out.printf("Digite o terceiro valor: ");
        int n3 = teclado.nextInt();
        teclado.close();
        if(n1  > n2){
            if(n2 > n3){
                System.out.printf("Valores em ordem crescente: %d , %d, %d", n3,n2,n1); 
            } else if (n3 > n2){
                System.out.printf("Valores em ordem crescente: %d , %d, %d", n2,n1,n3); 
            }
        } else if (n2 > n1){
            //n2 maior
            if(n1 > n3){
                System.out.printf("Valores em ordem crescente: %d , %d, %d", n3,n1,n2); 
            } else if (n3 > n1){
                System.out.printf("Valores em ordem crescente: %d , %d, %d", n1,n2,n3); 
            }
        } else if (n3 > n1){
            //n2 maior
            if(n1 > n2){
                System.out.printf("Valores em ordem crescente: %d , %d, %d", n2,n1,n3); 
            } else if (n2 > n1){
                System.out.printf("Valores em ordem crescente: %d , %d, %d", n1,n2,n3); 
            }
        
}
}}
