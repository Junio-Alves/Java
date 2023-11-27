/* Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 * Até 5 Kg
 * Morango R$ 2,50 por Kg
 * Maçã R$ 1,80 por Kg
 * 
 * Acima de 5 Kg
 * Morango R$ 2,20 por Kg
 * Maçã R$ 1,50 por Kg
 * 
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
   ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de
   morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */

import java.util.Scanner;

public class aula37 {
    public static void main(String[] args) {
        double total = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quatiade de KGs de Morango:");
        double morango = teclado.nextDouble();
        System.out.println("Digite a quatiade de KGs de Maças:");
        double macas = teclado.nextDouble();
        double peso_total = macas + morango;
        if(morango > 5){
            total = total + (morango * 2.20);
        } 
        if (macas > 5){
            total = total + (macas * 1.50);
        } 
        if(morango < 5){
            total = total + (morango * 2.50);
        }
        if (macas < 5){
            total = total + (macas * 1.80);
        }

        if(peso_total > 8 || total > 25){
            total = total - (total * 0.10);
        }

        System.out.printf("O valor total a se pagar é: %.2f ", total);


        
        teclado.close();
    }
}
