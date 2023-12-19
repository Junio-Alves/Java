/* Ler 10 valores e escrever quantos desses valores lidos estão no intervalo [10,20] (inlcuindo os
valores 10 e 20 no intervalo) e quantos deles estão fora deste intervalo. */

import java.util.Scanner;

public class aula60 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dentroDoIntervalo = 0;
        int foraDoIntevalo = 0;

        for(int i = 1;i <= 10; i++){
            System.out.printf("Digite o %dº valor: ", i);
            int valor = teclado.nextInt();
            if(valor >= 10 && valor <= 20){
                dentroDoIntervalo++;
            } else {
                foraDoIntevalo++;
            }
        }
        System.out.printf("Valores dentro do intervalo: %d \n Valores fora do intervalo: %d", dentroDoIntervalo,foraDoIntevalo);

        teclado.close();
    }
}
