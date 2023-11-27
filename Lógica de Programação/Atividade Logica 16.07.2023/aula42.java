/* Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para
estar em condições, um dos seguintes requisitos deve ser satisfeito:
- Ter no mínimo 65 anos de idade.
- Ter trabalhado no mínimo 30 anos.
- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano
de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo
de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'. */

import java.util.Calendar;
import java.util.Scanner;

public class aula42 {
    public static void main(String[] args) {
        String aposentadoria;
        Calendar cal = Calendar.getInstance();
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o numero do empregado: ");
        int n_empregado = teclado.nextInt();
        System.out.printf("Digite a data do seu nascimento: ");
        int data_nasci = teclado.nextInt();
        System.out.printf("Digite o ano do ingresso na empresa: ");
        int data_ingress = teclado.nextInt();
        int ano_atual = cal.get(Calendar.YEAR);
        int idade = ano_atual - data_nasci;
        int anos_trab = ano_atual - data_ingress;
        teclado.close();
        if(idade >= 65 || anos_trab >= 30){
            aposentadoria = "Requer aposentadoria.";
        } else if (idade >= 60 && anos_trab >= 25){
            aposentadoria = "Requer aposentadoria.";
        } else {
            aposentadoria = "Não requer aposentadoria.";
        }
        System.out.println(aposentadoria);

    }
}
