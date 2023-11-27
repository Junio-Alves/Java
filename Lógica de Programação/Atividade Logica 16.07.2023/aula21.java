/*Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os
minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é
de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte. */

import java.util.Scanner;

public class aula21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o horario de inicio do jogo: ");
        int h1 = 24 - teclado.nextInt() ;
        System.out.println("Digite o horario de fim do jogo: ");
        int h2 = 24 - teclado.nextInt();

        int duration = h1-h2;
        if(h1 == h2){
            duration = 24;
        }

        if(duration < 0){
            duration = 24 - (duration * -1);
            System.out.println("O jogo durou: " + duration +"hrs");
        } else{
            System.out.println("O jogo durou: " + duration +"hrs");
        }

        teclado.close();
    }
}
