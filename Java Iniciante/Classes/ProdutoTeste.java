package Classes;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto.desconto = 0.29;
        Produto.descontoEspecial = 0.50;
        Scanner teclado = new Scanner(System.in);

        Produto p1 = new Produto();
        System.out.println("Digite o Nome do Produto:");
            p1.nome = teclado.nextLine();
        System.out.println("Digite o Preço do Produto:");
            p1.preco = teclado.nextDouble();


        System.out.println(p1.nome + " " + p1.precoComDesconto());


        double precoFinal1 = p1.precoComDesconto();
        double mediaCarrinho = ((precoFinal1) / 2);
        System.out.printf("Media do Carrinho = R$%.2f.", mediaCarrinho);

        teclado.close();
    }
}
