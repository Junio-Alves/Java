/* Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS. */

import java.util.Scanner;

public class aula59 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valoresNegativos = 0;
        for(int i = 1; i <= 10; i++){
            System.out.print("Digite um valor: ");
            int valor = teclado.nextInt();
            if(valor < 0){
                valoresNegativos++;
            }
            
        }
        System.out.println("Total de numeros negativos é: " + valoresNegativos);
        teclado.close();
    }
}
