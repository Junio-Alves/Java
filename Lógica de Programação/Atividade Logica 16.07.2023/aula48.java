/* Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a
média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada
nota. */

import java.util.Scanner;

public class aula48 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         boolean reiniciar = true;
         while (reiniciar) {
         int nota1 = 0;
         int nota2 = 0;
         boolean n1 = true;
         boolean n2 = true;

         while (n1) {
             System.out.printf("Digite a primeira nota do aluno: ");
            nota1 = teclado.nextInt();
             if(nota1 >= 0 && nota1 <= 10){
                n1 = false;
             } else {
                System.out.println("Digite uma nota valida de 1 a 10!!");
             }
         }
         while (n2) {
             System.out.printf("Digite a segunda nota do aluno: ");
             nota2 = teclado.nextInt();
             if(nota2 >= 0 && nota2 <= 10){
                n2 = false;
             } else {
                System.out.println("Digite uma nota valida de 1 a 10!!");
             }
         }
         double media = (nota1 + nota2)/2;
         System.out.println("A media do aluno é: " + media);
         System.out.println("________________________________");
         System.out.println("Deseja colocar outra nota? S/N");
         teclado.nextLine();
         String question = teclado.nextLine().toLowerCase();

         if(question.equals("n")){
            reiniciar = false;
            System.out.println("Fechando...");
         }
        }
         teclado.close();
    }
}
