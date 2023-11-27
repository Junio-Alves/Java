package aula2;

public class caneta {
    //atributos
    String model;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //metodos
    void status(){
        System.out.println("Modelo: " + this.model);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou rasbiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
