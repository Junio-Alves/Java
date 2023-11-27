/* Um posto está vendendo combustíveis com a seguinte tabela de descontos:

Álcool
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro

Gasolina
até 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90. */

import java.util.Scanner;

public class aula35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de litros que você está comprando: ");
        double litros = teclado.nextDouble();
        System.out.println(" -------------------------------- \n Digite o tipo de combustivel: \n [A] - álcool \n [G] - gasolina \n -------------------------------- \n" + //
                " ");
        teclado.nextLine();
        String tipo = teclado.nextLine().toLowerCase();
        teclado.close();
        double valor_final = 0;
        double valor_inicial;
        if(tipo.equals("a")){
            if(litros <= 20){
                valor_inicial = litros * 2.90;
                valor_final = (valor_inicial) - (valor_inicial * 0.03);
            } else if (litros > 20){
                valor_inicial = litros * 2.90;
                valor_final = (valor_inicial) - (valor_inicial * 0.05);
            }
        } else if(tipo.equalsIgnoreCase("g")){
            if(litros <= 20){
                valor_inicial = litros * 2.90;
                valor_final = (valor_inicial) - (valor_inicial * 0.04);
            } else if (litros > 20){
                valor_inicial = litros * 2.90;
                valor_final = (valor_inicial) - (valor_inicial * 0.06);
            }
        } else {
            System.out.println("ESCOLHA UM TIPO VALIDO DE GASOLINA");
            
        }
        
        System.out.printf("O valor a ser pago é: %.2f ", valor_final);

    }
}
