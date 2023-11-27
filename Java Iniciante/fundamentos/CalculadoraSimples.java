package fundamentos;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        calculator();
    }
    static void calculator (){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro Numero:");
        Float n1 = teclado.nextFloat();
        System.out.print("Digite o segundo Numero:");
        Float n2 = teclado.nextFloat();
        float resultado = n1 + n2;
        System.out.printf("O resutado da soma foi: %.1f",resultado);

    }
}
