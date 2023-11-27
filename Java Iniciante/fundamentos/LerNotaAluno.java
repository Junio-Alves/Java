package fundamentos;

import java.util.Scanner;

public class LerNotaAluno {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:  ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno:  ");
        Float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome, nota);

    }
}


