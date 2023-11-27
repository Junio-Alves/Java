package fundamentos;

import java.util.Scanner;
public class DesafioLogicos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Trabalho terça: ");
        boolean trabalho1 = Boolean.parseBoolean(teclado.nextLine().toLowerCase());
        System.out.print("Trabalho quinta : ");
        boolean trabalho2 = Boolean.parseBoolean(teclado.nextLine().toLowerCase());

        boolean tV50 = trabalho1 && trabalho2;
        boolean tv32 = trabalho1 ^ trabalho2;
        boolean sorvete = trabalho2 || trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        //operador unario
        boolean maisSaudavel = !comprouSorvete;


        //V+V = comprar tv 50 - tomar sorvete
        //V+F = comprar tv de 32 - tomar sorvete
        //F + F = Sem sorvete

        System.out.println("Compraram a tv de 50? " + tV50);
        System.out.println("Compraram a tv de 32? " + tv32);
        System.out.println("Compraram sorvete?" + comprouSorvete);
        System.out.println("Mais saudavel?" + maisSaudavel);



    }
}
