package aula3;
public class aula3 {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        

    }
}
