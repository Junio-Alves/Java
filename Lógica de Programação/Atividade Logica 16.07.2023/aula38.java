/* Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja
diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a
mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se
esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a
senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’. */

import java.util.Scanner;

public class aula38 {
    public static void main(String[] args) {
        int codigo_usuario = 1234;
        int senha_usuario = 9999;
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Digite o codigo de usuário: ");
        int codigo = teclado.nextInt();
        if(codigo == codigo_usuario){
            System.out.printf("Digite a senha: ");
            int senha = teclado.nextInt();
            if(senha == senha_usuario){
                System.out.println("Acesso permitido!");
            }else{
                System.out.println("Senha invalida!");
            }
        } else {
            System.out.println("Usuário inválido!");
        }
        teclado.close();
    }
}
