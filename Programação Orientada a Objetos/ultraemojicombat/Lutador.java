package ultraemojicombat;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //construtor
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
            int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);;
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    

    //Metodos publicos
    public void apresentar(){
        System.out.println("___________________________________________________________");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.altura + "M");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas e ");
        System.out.println(this.getEmpates() + " Empates!");
        System.out.println("___________________________________________________________");

    }

    
    public void status(){
        System.out.println("___________________________________________________________");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes.");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes.");
        System.out.println("Empatou " + this.getEmpates() + " vezes.");
        System.out.println("___________________________________________________________");
        
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    //Metodos especiais



    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }


    private void setCategoria() {
        if(this.peso<52.2){
            this.categoria = "Inválido";
        }else if(this.peso<=70.3){
            this.categoria = "leve";
        }else if(this.peso<=83.9){
            this.categoria = "medio";
        }else if(this.peso<=120.2){
            this.categoria = "pesado";
        }else {
            this.categoria = "Inválido";
        }
    }


    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }


    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    public void setEmpates(int empates) {
        this.empates = empates;
    }


    public String getNome() {
        return nome;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }


    public int getIdade() {
        return idade;
    }


    public double getAltura() {
        return altura;
    }


    public double getPeso() {
        return peso;
    }


    public String getCategoria() {
        return categoria;
    }


    public int getVitorias() {
        return vitorias;
    }


    public int getDerrotas() {
        return derrotas;
    }


    public int getEmpates() {
        return empates;
    }

    
}
