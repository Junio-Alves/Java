package Classes.desafio;

public class pessoa {
    String nome;
    double peso;

    pessoa(){
        this.nome = nome;
        this.peso = peso;
    }
    void comer (comida comida){
        if (comida != null){
            this.peso += comida.peso;
        }
    }

    String apresentar (){
        return "Olá eu sou o" + nome + "e tenho " + peso + "Kg's.";
    }
}
