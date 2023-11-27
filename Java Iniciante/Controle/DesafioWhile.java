package Controle;

import java.util.Scanner;

public class DesafioWhile
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Double nota = 0.0;
        Double newNota = 0.0;
        double media;
        double cont = 0.0;

        while (newNota != -1)
        {
            System.out.print("Digite a nota: ");
            newNota = in.nextDouble();
            if (newNota > 0 && newNota <= 10 )
            {
                nota = nota + newNota;
                newNota = 0.0;
                cont++;
            }
            else  {
                System.out.println("Digite uma nota valida");
            }



        }
        media = nota/cont;
        System.out.printf("A media das notas é: %.2f", media);

        in.close();
    }
}
