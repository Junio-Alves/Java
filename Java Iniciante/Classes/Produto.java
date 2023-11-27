package Classes;
public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;
    static double descontoEspecial;
    Produto(){
    }
    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }
    double precoComDesconto() {
        return preco* (1- desconto) ;
    }
    double precoComDescontoEspecial() {

        return preco * (1 - descontoEspecial);
    }
}
