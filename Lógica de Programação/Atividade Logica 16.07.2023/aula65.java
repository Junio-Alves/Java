/* Ler 2 valores, calcular e escrever a soma dos inteiros existentes entre os 2 valores lidos (incluindo
os valores lidos na soma). Considere que o segundo valor lido será sempre maior que o primeiro valor
lido. */

import java.util.Scanner;

public class aula65 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        System.out.print("Digite o primeiro valor: ");
        int v1 = teclado.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = teclado.nextInt();
        teclado.close();
        if(v2>v1){
            for(int i = v1; i <= v2; i++){
                soma += i;
            };
            System.out.printf("A soma dos inteiros existente entre %d e %d é : %d",v1,v2,soma);
        } else {
            System.out.println("Digite o segundo valor maior!");
        }
    }
}
