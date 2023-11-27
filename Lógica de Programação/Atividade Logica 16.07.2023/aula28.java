/* Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. */
import java.util.Scanner;
public class aula28 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o primeiro valor: ");
        int n1 = teclado.nextInt();
        System.out.printf("Digite o segundo valor: ");
        int n2 = teclado.nextInt();
        System.out.printf("Digite o terceiro valor: ");
        int n3 = teclado.nextInt();
        teclado.close();
        if(n1 > n2 && n1 > n3){
            System.out.println("O maior numero é: " + n1);
        } else if (n2 > n1 && n2 > n3){
            System.out.println("O maior numero é: " + n2);
        } else {
            System.out.println("O maior numero é: " + n3);
        }
    }
}
