package fundamentos;

import java.util.Scanner;
public class FahrenheitToCelsius {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = 32;
        double y = 0.555;
        double z = 1.8;

           System.out.println("[1]CELSIUS TO FAHRENHEIT \n" +
                   "[2]FAHRENHEIT TO CELSIUS");
           String txt = teclado.nextLine();

           if (txt.equals("1")) {
               System.out.println("Digite a temperatura em celsius:");
               float c = teclado.nextInt();
               double f = (c*z)+x;
               System.out.println("A temperatura em Fahrenheit é:"  + f);

           }
           else if (txt.equals("2")) {
               System.out.println("Digite a temperatura em Fahrenheit:  ");
               float f = teclado.nextInt();
               double c = (f-x)*y;
               System.out.println("A temperatura em Celsius é :  " + c);

           }



    }

}



