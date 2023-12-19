/* Ler o número de alunos existentes em uma turma e, após isto, ler as notas destes alunos, calcular e
escrever a média aritmética dessas notas lidas. */

import java.util.Scanner;

public class aula62 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int qntd = teclado.nextInt();
        double media = 0;
        for(int i = 1; i <= qntd; i++){
            System.out.printf("Digite a nota do %dº aluno: ",i);
            double nota = teclado.nextInt();
            media = media + nota;
        }
        teclado.close();
        media = media/qntd;
        System.out.println("A media aritmética desses alunos é: " + media);
        
    }
}
