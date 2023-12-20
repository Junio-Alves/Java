/* Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo
que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o
valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das
mercadorias. */

import java.util.Scanner;

public class aula68 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        double valorTotal = 0;
        System.out.print("Digite o total de mercadorias no estoque: ");
        double totalMercad = teclado.nextDouble();
        for(int i = 1; i <= totalMercad; i++){
            System.out.printf("Digite o valor da %dº mercadoria: ",i);
            double valorUnitario = teclado.nextDouble();
            valorTotal += valorUnitario;
        }
         
        media = valorTotal/totalMercad;
        System.out.printf("O total de mercadoria em estoque é: R$%.2f \nA media do valor das mercadorias é: R$%.2f ",valorTotal,media);
        teclado.close();
    }
}
