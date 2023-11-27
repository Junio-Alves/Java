/*Escreva um algoritmo para ler o número total de eleitores de um município, 
o número de votos brancos, nulos e válidos. Calcular e escrever o percentual 
que cada um representa em relação ao total de eleitores. */

import 'dart:io';

void main() {
  print("__________________________________");
  print("Digite o numero de votos brancos:");
  String? inputb = stdin.readLineSync();
  print("__________________________________");
  print("Digite o numero de votos nulos");
  String? inputn = stdin.readLineSync();
  print("__________________________________");
  print("Digite o numero de votos validos");
  String? inputv = stdin.readLineSync();

  if (inputn != null && inputb != null && inputv != null) {
    double brancos = double.parse(inputb);
    double nulos = double.parse(inputn);
    double validos = double.parse(inputv);

    double total = brancos + nulos + validos;
    brancos = (brancos / total) * 100;
    nulos = (nulos / total) * 100;
    validos = (validos / total) * 100;

    print("__________________________________");
    print("Total de votos é: $total");
    print("Brancos %:$brancos");
    print("Nulos %:$nulos");
    print("Validos %:$validos");
    print("__________________________________");
  }
}
