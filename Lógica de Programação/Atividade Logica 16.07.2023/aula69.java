/* mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque.
Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar ‘MAIS
MERCADORIAS (S/N)?’. Ao final, imprimir o valor total em estoque e a média de valor das
mercadorias em estoque. */
import java.util.Scanner;

public class aula69 {
    public static void main(String[] args) {
        boolean condition = true;
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        double valorTotal = 0;
        int totalMercad = 0;
        for(int i = 1; condition; i++){
            System.out.printf("Digite o valor da %dº mercadoria: ",i);
            double valorUnitario = teclado.nextDouble();
            valorTotal += valorUnitario;
            totalMercad++;
            System.out.println("Mais mercadorias(S/N)?");
            teclado.nextLine();
            String r = teclado.nextLine();
            if(r.equals("N") || r.equals("n")){
                condition = false;
            }
        }
         
        media = valorTotal/totalMercad;
        System.out.printf("O total de mercadoria em estoque é: R$%.2f \nA media do valor das mercadorias é: R$%.2f ",valorTotal,media);
        teclado.close();
    }
}
