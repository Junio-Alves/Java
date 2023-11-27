package Classes;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // referencia valor

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1;   //referencia objeto

        d1.dia = 31;
        d1.mes = 12;
        d1.ano = 2025;

        System.out.println(d1.DataFormatada());
        System.out.println(d2.DataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.DataFormatada());
        System.out.println(d2.DataFormatada());

        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);


    }

    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int c){
        c++;
    }
}
