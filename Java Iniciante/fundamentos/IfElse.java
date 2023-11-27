package fundamentos;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("[SOMA] OU [MENOS]:    ");
        String nome = teclado.nextLine();
        System.out.print("Digite o primeiro numero:  ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo numero:  ");
        int n2 = teclado.nextInt();

        if (nome.equals("SOMA")){
            int resultado = n1+n2;
            System.out.printf("O resultado da soma foi: " + resultado );
        } else if (nome.equals("MENOS")) {
            int resultado = n1-n2;
            System.out.printf("O resultado da subtração foi:  " + resultado);
        }
    }
}
