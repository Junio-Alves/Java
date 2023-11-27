/* Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE. */

import java.util.Scanner;

public class aula32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do primeiro time:");
        String time1 = teclado.nextLine();
        System.out.println("Digite o nome do segundo time:");
        String time2 = teclado.nextLine();
        System.out.printf("Digite a quatidade de gols marcados pelo %s : ",time1);
        int gols1 = teclado.nextInt();
        System.out.printf("Digite a quatidade de gols marcados pelo %s : ",time2);
        int gols2 = teclado.nextInt();
        teclado.close();
        if(gols1 == gols2){
            System.out.printf("O time %s empatou com o time %s", time1, time2);
        } else if (gols1 > gols2){
            System.out.printf("O %s ganhou do $s ! ", time1, time2);
        } else { 
            System.out.printf("O %s ganhou do %s ! ", time2, time1);;
        }
    }
}
