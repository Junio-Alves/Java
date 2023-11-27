/* Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
dos outros 2 lados. */

import java.util.Scanner;

public class aula31 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o lado A: ");
        int a = teclado.nextInt();
        System.out.printf("Digite o lado B: ");
        int b = teclado.nextInt();
        System.out.printf("Digite o lado C: ");
        int c = teclado.nextInt();
        teclado.close();
        if(a < b + c){
            System.out.println("Forma um triangulo!");
        } else if (b < c + a){
            System.out.println("Forma um triangulo!");
        } else if (c < a + b){
            System.out.println("Forma um triangulo!");
        } else {
            System.out.println("Não forma um triangulo!");
        }
    }
}
