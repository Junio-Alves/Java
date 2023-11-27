package Controle;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        String valor = "";
        Scanner teclado = new Scanner(System.in);

         while (!valor.equalsIgnoreCase("Sair")){
            System.out.println("voçe diz:");
            valor = teclado.nextLine();
        }



        }


    }
