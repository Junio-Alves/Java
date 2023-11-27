package Classes;

import java.util.Scanner;

public class DataTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Data d1 = new Data();

        System.out.printf("Data Padrão: %s \n", d1.DataFormatada());

        System.out.println("Digite o Dia:");
        d1.dia = teclado.nextInt();

        System.out.println("Digite o mes:");
        d1.mes = teclado.nextInt();

        System.out.println("Digite o ano:");
        d1.ano = teclado.nextInt();

        //System.out.println(d1.DataFormatada());
        d1.imprimirDataFormatada();


    }
}
