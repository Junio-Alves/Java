package Classes.desafio;

import java.util.Scanner;

public class jantar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        pessoa p = new pessoa();
        System.out.println("Digite seu nome:");
        p.nome = teclado.nextLine();
        System.out.println("Digite seu peso:");
        p.peso = teclado.nextDouble();


        comida c1 = new comida();
        System.out.println("Digite oque voçe comeu:");
        c1.nome = teclado.nextLine();
        System.out.println("Digite o peso da comida:");
        c1.peso = teclado.nextDouble();

        p.comer(c1);

        System.out.println(p.apresentar());

    }
}
