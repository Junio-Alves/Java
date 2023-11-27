package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Usuario> Lista = new ArrayList<>();
        Usuario u1 = new Usuario("Ana");
        Lista.add(u1);
        //Lista.add(new Usuario(teclado.nextLine()));
        Lista.add(new Usuario("Pedro"));
        Lista.add(new Usuario("viv"));
        Lista.add(new Usuario("flavio"));

        System.out.println(Lista.get(3).nome);

        Lista.remove(1);
        System.out.println(Lista.remove(new Usuario("Manu")));

        for (Usuario u: Lista){
            System.out.println(u.nome);

        }
    }

}
