/* Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15
(inclusive) e 100 (inclusive). */
public class aula67 {
    public static void main(String[] args) {
        double media = 0;
        double div = 0;
        for( int i = 15; i <= 100; i++){
            media += i;
            div ++;
        }
        media = media/div;
        System.out.println("A media aritmética dos números inteiros entre 15 e 100 é: " + media);
    }
}
