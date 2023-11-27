/* Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.
Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média
final é: */

import java.util.Scanner;

public class aula13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a primeira nota: ");
        double n1 = teclado.nextDouble();
        System.out.printf("Digite a segunda nota: ");
        double n2 = teclado.nextDouble();
        System.out.printf("Digite a terceira nota: ");
        double n3 = teclado.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 5)/10;
        System.out.printf("A media final é: %.2f", media);
        teclado.close();
        
    }
}
