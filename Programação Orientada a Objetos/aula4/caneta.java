package aula4;

public class caneta {
    //atributos
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public caneta(String modelo, String cor, float ponta){ //metodo construtor
        setModelo(modelo);
        setPonta(ponta);
        setCor(cor);
        this.tampar();
        this.cor = "azul";
    }


    //metodos
    public String getCor(){
        return this.cor;
    }

    public void setCor(String c){
        this.cor = c;

    }
    
    public String getModelo(){
        return this.modelo;
    };

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getModelo());
        System.out.println("Cor:" + this.cor);
        System.out.println("Tampada:" + this.tampada);
    }
}

