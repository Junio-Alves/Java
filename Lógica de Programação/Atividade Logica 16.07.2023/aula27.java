/*Ler um valor e escrever se é positivo, negativo ou zero. */
import java.util.Scanner;
public class aula27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o valor: ");
        int valor = teclado.nextInt();
        teclado.close();
        if(valor > 0){
            System.out.println("O valor é positivo!");
        } else if (valor < 0){
            System.out.println("O valor é negativo");
        } else {
            System.out.println("Valor é zero!");
        }

    }
}
