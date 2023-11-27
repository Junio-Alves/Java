package aula5_Banco;
import java.util.Random;

public class banco {
    Random random = new Random();
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Construtor
    public banco(){
        setnumConta(random.nextInt(0, 1000));
        setStatus(false);
        setSaldo(0);
    }
    

    //Metodos
    public void abrirConta(String tipo, String nome){
        setDono(nome);
        setStatus(true);
        if(tipo.equalsIgnoreCase("Corrente") || tipo.equalsIgnoreCase("Poupança")){
            setTipo(tipo);
            if (getTipo().equalsIgnoreCase("Corrente")){
                setSaldo(50);
            } else if(getTipo().equalsIgnoreCase("Poupança")) {
                setSaldo(150);
            }
        } else {
            System.out.println("Digite um tipo valido! [Corrente] [Poupança]");
        }
        status("CONTA ABERTA!");
    }

    public void fecharConta(){
        if(getsaldo() == 0){
            setStatus(false);;
            System.out.println("Conta fechada com sucesso!"); 
        } else if(getsaldo() < 0) {
            System.out.println("Sua conta está negativada e não pode ser fechada!");
        } else{
            System.out.println(" Sua conta possui saldo e não pode ser fechada!");
        }
    }

    public void depositar(double valor){
        if(getStatus()){
            setSaldo(getsaldo()+valor);
            System.out.println("Você depositou: R$" + valor);
        } else {
            System.out.println("Só pode depositar se sua conta estiver aberta!");
        }
    }

    public void sacar(double valor){
        if(getStatus() && getsaldo() >= valor){
            setSaldo(getsaldo() - valor);
            System.out.println("Você sacou: R$" + valor);
        } else if (getsaldo() < 0) {
            System.out.println("Só pode sacar se sua conta tiver saldo");
        } else if (getsaldo() < valor){
            System.out.println("Valor insuficiente para sacar!");
        } else{
            System.out.println("Só pode sacar se sua conta estiver aberta!");
        }
    }

    public void pagarMensal(){
        if(getTipo().equalsIgnoreCase("Corrente")){
            if(getStatus() && getsaldo() > 12){
                setSaldo(getsaldo() - 12);
                System.out.println("Mensalidade paga com sucesso!");
            } else if(getsaldo() < 12){
                System.out.println("Valor insuficiente para pagar a mensalidade!");
            } else {
                System.out.println("Para pagar a mensalidade, a conta precisa estar aberta!");
            }}
        
        if(getTipo().equalsIgnoreCase("Poupança")){
            if(getStatus() && getsaldo() > 20){
                setSaldo(getsaldo() - 20);
                System.out.println("Mensalidade paga com sucesso!");
            } else if(getsaldo() < 20){
                System.out.println("Valor insuficiente para pagar a mensalidade!");
            } else {
                System.out.println("Para pagar a mensalidade, a conta precisa estar aberta!");
            }
        }
    
    
    //Metodos especiais

}
    private int getnumConta(){
        return this.numConta;
    }
    private void setnumConta(int NumeroConta){
        this.numConta = NumeroConta;
    }

    private String getTipo(){
        return this.tipo;
    }
    private void setTipo(String Tipo){
        this.tipo = Tipo;
    }

    private String getDono(){
        return this.dono;
    }
    private void setDono(String dono){
        this.dono = dono;
    }

    private double getsaldo(){
        return this.saldo;
    }
    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    private boolean getStatus(){
        return this.status;
    }
    private void setStatus(boolean status){
        this.status = status;
    }

    private void status(String msgbox){
        System.out.println(msgbox);
        System.out.println("---------------------------------------------------");
        System.out.println("Numero da conta: " + getnumConta());
        System.out.println("Tipo:" + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: R$"+ getsaldo());
        System.out.println("Status: " + getStatus());
        System.out.println("---------------------------------------------------");
    }
}
