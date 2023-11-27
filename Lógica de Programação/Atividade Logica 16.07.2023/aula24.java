/*Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que
ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que
ultrapassar este valor, calcular e escrever o seu salário total. */

import java.util.Scanner;

public class aula24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite seu salario fixo:R$ ");
        double salario = teclado.nextDouble();
        System.out.printf("Digite o valor de vendas efetuadas:R$ ");
        double vendas = teclado.nextDouble();
        double comissao;
         if(vendas < 1500){
           comissao = vendas * 0.03;
        } else {
            comissao = (1500 * 0.03) + ((vendas - 1500) * 0.05);
        }
        double salario_fixo = comissao + salario;

        System.out.printf("Salario total é: R$ %.2f", salario_fixo );
        teclado.close();
    }
}
