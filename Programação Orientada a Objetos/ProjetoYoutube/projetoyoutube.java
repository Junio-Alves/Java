package ProjetoYoutube;

public class projetoyoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");  
        
        gafanhoto g[] = new gafanhoto[2];
        g[0] = new gafanhoto("Junio", 19, "M", "juniophb2004");
        g[1] = new gafanhoto("Isaias", 18, "M", "JaponesFalso");

        vizualizacao vis[] = new vizualizacao[5];
        vis[0] = new vizualizacao(g[0], v[2]); //Junio assiste video HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new vizualizacao(g[0], v[1]); // Junio Assiste video PHP
        vis[0].avaliar(35.0f);
        System.out.println(v[0].toString());
    }

}
