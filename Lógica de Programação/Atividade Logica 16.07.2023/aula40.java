/* Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço
unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total
a pagar (total a pagar = total - desconto), sabendo-se que:
- Se quantidade <= 5 o desconto será de 2%
- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
- Se quantidade > 10 o desconto será de 5% */

import java.util.Scanner;

public class aula40 {
    public static void main(String[] args) {
        double total_pagar = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o nome do produto:");
        String produto = teclado.nextLine();
        System.out.printf("Digite a quantidade comprada de %s :", produto);
        int quantidade = teclado.nextInt();
        System.out.printf("Digite a quantidade unitaria de %s :", produto);
        int unitaria = teclado.nextInt();
        teclado.close();
        int total = quantidade * unitaria;
        if(quantidade <= 5){
            total_pagar = total - (total * 0.02);
        } else if(quantidade > 5 && quantidade <= 10){
            total_pagar = total - (total * 0.03);
        } else if(quantidade > 10){
            total_pagar = total - (total * 0.05);
        }
        System.out.printf("O total a pagar será de: R$ %.2f", total_pagar);
    }
}
