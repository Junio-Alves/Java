/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais
de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva
o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
(considere que o mês possua 4 semanas exatas). */

import java.util.Scanner;

public class aula22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a quantidade de horas trabalhadas: ");
        double hora = teclado.nextDouble();
        System.out.printf("Digite seu salario por hora trabalhada: ");
        double salario = teclado.nextDouble();
        double salario_base = 160 * salario;
        if(hora > 160){
            double hora_extra = hora - 160;
            double salario_hora_extra = (hora_extra * (salario * 1.50));
            double salario_final = salario_base + salario_hora_extra ;

            System.out.println("Seu salário com acrescimo de hora extra é: " + salario_final);
        } else {
            System.out.println("Seu salario é: " + salario_base);
        }
        teclado.close();
        
    }
}
