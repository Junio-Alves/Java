package projetolivro;

public class projetrolivro {
    public static void main(String[] args) {
        pessoa[] p = new pessoa[2];
        livro[] l = new livro[3];

        p[0] = new pessoa("Junio", 19, "M");
        p[1] = new pessoa("Japinha", 18, "F");

        l[0] = new livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new livro("Poo Para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new livro("Java Avançado", "Maria Candido", 800, p[0]);

        l[0].abrir();
        l[0].folhear(200);

        l[0].detalhes();

    }
}
