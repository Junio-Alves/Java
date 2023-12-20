/* O mesmo exercício anterior, mas agora, considere que o segundo valor lido poderá ser maior ou
menor que o primeiro valor lido, ou seja, deve-se testá-los. */

import java.util.Scanner;

public class aula66 {
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
        } else if(v2<v1) {
            /* i = 5 */
            for(int i = v2; i <= v1; i++){
                soma += i;
            };
        }
        System.out.printf("A soma dos inteiros existente entre %d e %d é : %d",v1,v2,soma);
    }
}
