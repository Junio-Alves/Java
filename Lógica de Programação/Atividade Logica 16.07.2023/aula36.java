/* Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
novo com a mulher mais velha. */

import java.util.Scanner;

public class aula36 {
    public static void main(String[] args) {
        int h_velho;
        int h_novo;
        int m_velha;
        int m_nova;
        int soma;
        int produto;


        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade do primeiro homem:");
        int h1 = teclado.nextInt();
        System.out.println("Digite a idade do segundo homem:");
        int h2 = teclado.nextInt();
        System.out.println("Digite a idade da primeira mulher:");
        int m1 = teclado.nextInt();
        System.out.println("Digite a idade da segunda mulher:");
        int m2 = teclado.nextInt();
        teclado.close();

        if(h1 > h2){
            h_velho = h1;
            h_novo = h2;
        } else {
            h_velho = h2;
            h_novo = h1;
        }

        if(m1 > m2){
            m_velha = m1;
            m_nova = m2;
        } else{
            m_velha = m2;
            m_nova = m1;
        }

        soma = h_velho + m_nova;
        produto = h_novo + m_velha;

        System.out.println("A soma do homem mais velho com a mulher mais nova é: " + soma);
        System.out.println("O produto da idade do homem mais novo com a mulher mais velha é:" + produto);

    }
    
}
