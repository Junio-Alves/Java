package aula13;

public class mamifero extends animal {
    protected String corPelo;
    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero!");
    }
}
