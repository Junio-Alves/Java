package fundamentos;

import javax.swing.*;

public class DesafioCalculadora {
    public static void main(String[] args) {
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro numero"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo numero"));
        String escolha = JOptionPane.showInputDialog("[+] [-] [*] [/] ");

        double resultado = "+".equals(escolha) ? (valor1+valor2) : 0;
        resultado = "-".equals(escolha) ? (valor1-valor2) : resultado;
        resultado = "*".equals(escolha) ? (valor1*valor2) : resultado;
        resultado = "/".equals(escolha) ? (valor1/valor2) : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", valor1, escolha, valor2,resultado);





    }
}
