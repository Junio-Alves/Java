package fundamentos;

public class Logicos {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3>7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!!condicao2);

        System.out.println("Tabela verdade E(AND)");
        System.out.println(true && true); //V
        System.out.println(true && false); //F
        System.out.println(false && true); //F
        System.out.println(false && false); //F
        // aceita somente VERDADEIRO

        System.out.println("\nTabela verdade OU(OR)");
        System.out.println(true || true); //V
        System.out.println(true || false); //V
        System.out.println(false || true); //V
        System.out.println(false || false); //F
        //NECESSITA APENAS DE UM VERDADEIRO

        System.out.println("\nTabela verdade E(AND)");
        System.out.println(true ^ true); //F
        System.out.println(true ^ false); //V
        System.out.println(false ^ true); //V
        System.out.println(false ^ false); //F
        //UM OU OUTRO,JAMAIS OS DOIS OU NENHUM

        System.out.println("\nTabela verdade NOT");
        System.out.println(!true); //F
        System.out.println(!false); //V
        //NEGAÇÃO




    }
}
