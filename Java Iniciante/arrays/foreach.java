package arrays;

public class foreach {
    public static void main(String[] args) {
        double [] Notas = {9.9, 8.7, 7.2, 9.4 };

        for (int i = 0; i < Notas.length; i++){
            System.out.print(Notas[i] + " ");
        }

        System.out.println("");

        for(double nota: Notas){
            System.out.print(nota + " ");
        }
    }
}
