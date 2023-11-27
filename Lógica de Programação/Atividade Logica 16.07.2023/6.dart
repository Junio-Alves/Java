/*Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular 
e escrever a área do retângulo.

A=b⋅h  */

import 'dart:io';

void main() {
  print("Digite a base do retangulo:");
  String? inputB = stdin.readLineSync();

  print("Digite a altura do retangulo:");
  String? inputH = stdin.readLineSync();

  if (inputH != null && inputB != null) {
    int b = int.parse(inputB);
    int h = int.parse(inputH);
    int area = b * h;
    print("A area do retangulo é: $area");
  }
}
