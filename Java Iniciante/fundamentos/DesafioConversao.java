package fundamentos;

import java.util.Scanner;
public class DesafioConversao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu primeiro salario:");
        String salario1 = teclado.nextLine();
        System.out.println("Digite seu segundo salario:");
        String salario2 = teclado.nextLine();
        System.out.println("Digite seu terceiro salario:");
        String salario3 = teclado.nextLine();


        double s1 = Double.parseDouble(salario1.replace(",","."));
        double s2 = Double.parseDouble(salario2.replace(",","."));
        double s3 = Double.parseDouble(salario3.replace(",","."));

        double media = (s1+s2+s3)/3;

        System.out.printf("A media do salario é R$: %.2f.", media);

        teclado.close();
    }
}
