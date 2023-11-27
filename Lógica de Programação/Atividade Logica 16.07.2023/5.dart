/*Escreva um algoritmo para ler um valor (do teclado) 
e escrever (na tela) o seu antecessor. */

import 'dart:io';

void main() {
  print("Digite o valor:");
  String? input = stdin.readLineSync();
  if (input != null) {
    int numero = int.parse(input);
    numero--;
    print("Numero anterior é $numero");
  }
}
