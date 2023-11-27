package projetolivro;

public class pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Metodos
    public void fazerAniver(){
        System.out.println("PARABENS!!!");
        this.setIdade(getIdade() + 1);
    }

    //Metodos Especiais
    public pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }
    

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
