/*Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o
aluno é aprovado). Escrever também a média calculada. */

import java.util.Scanner;

public class aula17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        double n1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double n2 = teclado.nextDouble();
        double media = (n1+n2)/2;
        if(n1 > 10 || n1 < 0 && n2 > 10 || n2 < 0 ){
            System.out.println("Digite notas validas!");
            System.exit(0);
        }else{
            if(media >= 6){
                System.out.printf("O aluno foi aprovado com media: %.2f", media);
            } else {
                System.out.printf("O aluno foi reprovado com media: %.2f", media);
            }
        }

        teclado.close();
        
    }
    
}
