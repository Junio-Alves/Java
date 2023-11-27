import java.util.Scanner;

public class aula15 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o valor: ");
        int valor = teclado.nextInt();
        if(valor > 0 || valor == 0 ){
            System.out.println("Valor é positivo");
        }else{
            System.out.println("Valor é negativo");
        }
        teclado.close();
 }   
}
