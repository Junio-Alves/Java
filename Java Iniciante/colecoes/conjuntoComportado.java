package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {
    public static void main(String[] args) {


        SortedSet<String> listaAprovados = new TreeSet<>(); //
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String Candidato: listaAprovados){
            System.out.println(Candidato);

        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n: nums){
            System.out.println(n);
        }
    }
}
