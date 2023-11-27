package oo.composicao;

public class motor {
    carro Carro;
    boolean ligado = false;
    double fatorInjecao = 1;

    motor(carro Carro){
        this.Carro = Carro;
    }
    int giros (){
        if (!ligado){
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }


    }
}
