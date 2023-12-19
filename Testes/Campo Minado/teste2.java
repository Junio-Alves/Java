public class teste2 {
    public static void main(String[] args) {
        // Defina o número de asteriscos desejado
        int numeroDeLinhas = 5;
        int numeroDeColunas = 5;
  

        // Loop para imprimir os asteriscos lado a lado
        for (int c = 1; c <= numeroDeColunas; c++){
            System.out.println();
            for (int l = 1; l <= numeroDeLinhas; l++) {
                if(c == 2 && l  == 5){
                    System.out.print(" X ");
                }else if(c == 1 || c == numeroDeColunas){
                    System.out.print(" * ");
                } else if(l == 1 || l == numeroDeLinhas) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
        }

        // Adicione uma quebra de linha no final para separar as linhas
        System.out.println();
    }
}
