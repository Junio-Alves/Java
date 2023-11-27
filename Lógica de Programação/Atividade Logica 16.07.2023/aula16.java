/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
escreva o custo total da compra. */

import java.util.Scanner;

public class aula16 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         System.out.println("Digite quantas maçãs foram compradas:");
         double macas = teclado.nextDouble();
         if(macas < 12){
            double total = macas * 1.30;
            System.out.printf("O custo total foi: %.2f", total);
         }else{
            double total = macas * 1;
            System.out.printf("O custo total foi: %.2f", total);
         }

         
         teclado.close();
    }
}
