public class Teste {
    public static void main(String[] args) {
        // Defina o número de asteriscos desejado
        int numeroDeLinhas = 5;
        int numeroDeColunas = 5;
        String caractere = "*";

        // Loop para imprimir os asteriscos lado a lado
        System.out.print("  A B C D E ");
        for (int c = 1; c <= numeroDeColunas; c++){
            System.out.println();
            System.out.print(c);
            for (int i = 1; i <= numeroDeLinhas; i++) {
                if(c == 5 && i == 5){
                    System.out.print(" X");
                } else {
                    System.out.print(" ~");
                }
            }
        }

        // Adicione uma quebra de linha no final para separar as linhas
        System.out.println();
    }
}
