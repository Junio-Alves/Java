package projetopessoas;

public class projetoPessoas {
    public static void main(String[] args) {
        pessoa p1 = new pessoa();
        aluno p2 = new aluno();
        professor p3 = new professor();
        funcionario p4 = new funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setSexo("m");
        p4.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Informatica");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");

        p1.apresentar();
        p2.apresentar();
        p3.apresentar();
        p4.apresentar();


    }
}
