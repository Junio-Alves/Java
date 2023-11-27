/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu) */

import java.util.Calendar;
import java.util.Scanner;

public class aula18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento:");
        int nascimento = teclado.nextInt();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int idade = year-nascimento;
        if(idade >= 16 && idade <= 70){
            System.out.println("Você ja pode votar!, sua idade atual é: " + idade + " anos." );
        } else{
            System.out.println("Você não pode votar!, sua idade atual é: " + idade + " anos." );
        }
        teclado.close();
    }
    
}
