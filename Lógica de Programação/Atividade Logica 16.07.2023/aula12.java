/* Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius (baseado na fórmula abaixo): */

import java.util.Scanner;

public class aula12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.printf("Digite a temperatura em Fahrenheit: "); 
        double F = teclado.nextDouble();
        double Celsius = ((F - 32)*5)/9;
        System.out.printf("A temperatura em Celcius é: %.2f", Celsius);
        teclado.close();
    }
}
