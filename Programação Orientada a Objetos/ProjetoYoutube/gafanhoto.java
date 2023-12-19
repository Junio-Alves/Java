package ProjetoYoutube;

public class gafanhoto extends pessoa{
    //Atributos
    private String login;
    private int totAssistido;
    
    
    //Construtor
    public gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    //MetodosEspeciais
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "gafanhoto [" +super.toString()+ "\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
    }

    
}
