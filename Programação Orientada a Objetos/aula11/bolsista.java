package aula11;

public class bolsista extends aluno {
    private double bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! pagamento realizado.");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
}
