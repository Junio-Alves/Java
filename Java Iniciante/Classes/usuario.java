package Classes;

public class usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof usuario) {
            usuario outro = (usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else {
            return false;
        }
    }
}
