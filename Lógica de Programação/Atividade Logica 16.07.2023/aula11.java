/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele
efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas
vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do
vendedor. */

import java.util.Scanner;

public class aula11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite a quantidade de carros vendidos: ");
        double qntd_carros_vendidos = teclado.nextDouble();
        System.out.printf("Digite o Valor total de suas vendas: R$ ");
        double valor_vendas = teclado.nextDouble()*0.05;
        System.out.printf("Digite seu Salario fixo: R$ ");
        double salario_fixo = teclado.nextDouble();
        System.out.printf("Digite o valor que você recebe por cada carro vendido: R$");
        double comissao = (qntd_carros_vendidos)*teclado.nextDouble();
        double salario_final = salario_fixo+valor_vendas+comissao;
        System.out.printf("Salario final é: R$ " + salario_final);


        teclado.close();
    }
}
