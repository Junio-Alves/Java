package oo.composicao;

public class carro {
    motor Motor;

    carro(){
        this.Motor = new motor(this);
    }

    void acelerar(){
        if(Motor.fatorInjecao < 2.6) {
            Motor.fatorInjecao += 0.4;
        }
    }

    void frear(){
        if(Motor.fatorInjecao < 0.5) {
            Motor.fatorInjecao -= 0.4;
        }
    }

    void ligar (){
        Motor.ligado = true;
    }

    void desligado(){
        Motor.ligado = false;
    }

    boolean estaLigado(){
        return Motor.ligado;
    }
}
