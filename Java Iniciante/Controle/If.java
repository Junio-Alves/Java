package Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a media:");
        double media = teclado.nextDouble();

        if (media <= 10  && media >= 7.0){
            System.out.println("Aprovado!");
            System.out.println("Parabens!");
        }
        if (media < 7 && media >= 4.5)
            System.out.println("recuperação");

        boolean criteriorReprovado=  media < 4.5 && media >= 0;
        if (criteriorReprovado){
            System.out.println("reprovado");
        }


        teclado.close();
    }
}
