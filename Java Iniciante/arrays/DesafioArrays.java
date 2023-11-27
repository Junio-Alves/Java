package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantas notas voçe quer ler?");

        double [] notas = new double[teclado.nextInt()];
        int quantidade = 1;

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dº nota\n", quantidade++);
            notas[i] = teclado.nextDouble();
        }

        double total = 0;
        for (double nota: notas){
            total += nota;
        }


        double media = total/notas.length;
        System.out.println("A media é:" + media);
        teclado.close();

    }
}
