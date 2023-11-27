/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor. */

import java.util.Scanner;

public class aula10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o valor de fabrica do carro: R$");
        double valor_fabrica = teclado.nextDouble();
        double valor_final = (valor_fabrica * 1.28 * 1.45); 
        System.out.printf("O valor final é de R$:" + valor_final);
        teclado.close();
    }
}
