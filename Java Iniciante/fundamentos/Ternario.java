package fundamentos;

public class Ternario {
    public static void main(String[] args) {
        double media = 8.6;
        String resultadoFinal = media >= 7.0 ? "Aprovado ": "Resprovado";
        System.out.println("O aluno está" + resultadoFinal);

        double nota=9.9;
        boolean bomCompartamento = true;
        boolean passouPorMedia = nota>=7;
        boolean temDesconto = bomCompartamento && passouPorMedia;
        String resultado = temDesconto ? "sim":"não";
        System.out.println("Tem Desconto?" + resultado);
    }
}
