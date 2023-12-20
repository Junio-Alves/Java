/* Escreva um algoritmo para ler 10 números. Todos os números lidos com valor inferior a 40 devem
ser somados. Escreva o valor final da soma efetuada. */

import java.util.Scanner;

public class aula64 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        for(int i = 1; i <= 10; i++){
            System.out.printf("Digite o %dº numero: ",i);
            int n = teclado.nextInt();
            if(n <= 40){
                soma = soma + n;
            }
        }
        teclado.close();
        System.out.println("A soma de todos os numeros inferiores a 40 é: " + soma);
    }
}
