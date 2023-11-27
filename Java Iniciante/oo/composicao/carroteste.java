package oo.composicao;

public class carroteste {
    public static void main(String[] args) {

        carro c1 = new carro();
        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.Motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.Motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();



    }
}
