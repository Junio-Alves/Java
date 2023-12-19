/* Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valor
informado (para N) não seja maior que 0, deverá ser lido um novo valor para N. */

import java.util.Scanner;

public class aula55 {
    public static void main(String[] args) {
        boolean c = true;
        Scanner teclado = new Scanner(System.in);
        while (c) {
            System.out.printf("Digite a quantidade: ");
            int n = teclado.nextInt();
            if(n <= 0){
                System.out.println("Digite um valor maior que 0!");
            } else {
                for(int i = 1; i <= n ; i++){
                    System.out.println(i);
                }
                c = false;
            }
        }
        teclado.close();
    }
}
