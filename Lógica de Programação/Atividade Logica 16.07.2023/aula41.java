/* Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos
exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo
e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:

Média_de_Aproveitamento = (N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios) / 7

A atribuição de conceitos obedece a tabela abaixo:

Média de Aproveitamento Conceito
> = 9,0         A
> = 7,5 e < 9,0 B
> = 6,0 e < 7,5 C
< 6,0           D
*/

import java.util.Scanner;

public class aula41 {
    public static void main(String[] args) {
        String conceito;
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a primeira nota: ");
        int n1 = teclado.nextInt();
        System.out.printf("Digite a segunda nota: ");
        int n2 = teclado.nextInt();
        System.out.printf("Digite a terceira nota: ");
        int n3 = teclado.nextInt();
        System.out.printf("Digite a média dos exercícios: ");
        int Média_dos_Exercícios =  teclado.nextInt();
        teclado.close();
        double Média_de_Aproveitamento = (n1 + n2 * 2 + n3 * 3 + Média_dos_Exercícios)/7;
        if(Média_de_Aproveitamento >= 9 && Média_de_Aproveitamento <= 10){
            conceito = "A";
        } else if(Média_de_Aproveitamento >= 7.5 && Média_de_Aproveitamento < 9.0){
            conceito = "B";
        } else if(Média_de_Aproveitamento >= 6.0 && Média_de_Aproveitamento < 7.5){
            conceito = "B";
        } else if(Média_de_Aproveitamento < 6.0 && Média_de_Aproveitamento >= 0){
            conceito = "D";
        } else {
            System.out.println("Nota invalida!");
            conceito = "";
        }

        System.out.println("Seu conceito foi: " + conceito);
    }
}
