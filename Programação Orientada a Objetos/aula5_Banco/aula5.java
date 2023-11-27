package aula5_Banco;

public class aula5 {
    public static void main(String[] args) {
        banco conta1 = new banco();
        conta1.abrirConta("corrente", "Junio");
        conta1.sacar(60);
        conta1.pagarMensal();
    }
    
}


