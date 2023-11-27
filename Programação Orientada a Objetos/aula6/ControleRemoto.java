package aula6;

public class ControleRemoto implements controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //construtor
    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }



    //Metodos Especiais
    private void setVolume(int volume){
        this.volume = volume;
    }
    private int getVolume(){
        return this.volume;
    }
    
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }
    private boolean getTocando(){
        return this.tocando;
    }

    //Metodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }



    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado?" + this.getLigado());
        System.out.println("Está tocando?" + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i<= this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu!");
    }



    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume() + 5);
        }
    }



    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(getVolume() - 5);
        }
    }



    @Override
    public void ligarMudo() {
        if(getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }



    @Override
    public void desligarMudo() {
        if(getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }



    @Override
    public void play() {
        if(this.ligado && !(this.getTocando())){
            this.setTocando(true);
        }
    }



    @Override
    public void pause() {
        if(this.ligado && getTocando()){
            this.setTocando(false);
        }
    }
}
