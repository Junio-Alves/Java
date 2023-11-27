package aula11;

public class Aula11 {
    public static void main(String[] args) {
        visitante v1 = new visitante();
        v1.setNome("Junio");
        v1.setIdade(19);
        v1.setSexo("M");
        System.out.println(v1.toString());


        aluno a1 = new aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        bolsista b1 = new bolsista();
        b1.setMatricula(1112);
        b1.setNome("Isaias");
        b1.setBolsa(12);
        b1.setSexo("M");
        b1.pagarMensalidade();

    }

    
}
