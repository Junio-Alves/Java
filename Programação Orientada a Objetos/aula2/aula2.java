package aula2;
public class aula2 {
    public static void main(String[] args) {
        caneta caneta1 = new caneta();
        caneta1.cor = "vermelha";
        caneta1.ponta = 1.0f;
        caneta1.tampada = false;
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();

    }
}
