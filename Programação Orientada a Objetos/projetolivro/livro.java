package projetolivro;

public class livro implements publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private pessoa leitor;

    //Metodos
    public void detalhes() {
        System.out.println("livro [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
                + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + "]");
    }
    

    //Metodos Especiais
    public livro(String titulo, String autor, int totPaginas, pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setTotPaginas(totPaginas);
        this.setLeitor(leitor);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public boolean isAberto() {
        return aberto;
    }
    public pessoa getLeitor() {
        return leitor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public void setLeitor(pessoa leitor) {
        this.leitor = leitor;
    }


    @Override
    public void abrir() {
        this.setAberto(true);
    }


    @Override
    public void fechar() {
        this.setAberto(false);
    }


    @Override
    public void folhear(int p) {
        if(p > getTotPaginas()){
            this.setPagAtual(0);
        } else {
            this.setPagAtual(p);
        }
    }
    
    
    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual());
    }


    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual()-1);
    }

    
    
}
