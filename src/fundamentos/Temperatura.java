package fundamentos;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         /*

    Converta Fahrenheit para Celsius.

    (°F - 32) x 5/9 = °C

     */

//        System.out.print("Digite a temperatura em Fahrenheit: ");
//        double Fahrenheit = entrada.nextDouble();
//
//        double Celsius = (Fahrenheit - 32) * 5 / 9;
//        System.out.println("Conversão em Celsius é: " +Celsius+ "ºC");




        /*
        Celsius para Fahrenheit
        (°C × 9/5) + 32
         */

        System.out.print("Temperatura em Celsius: ");
        double C = entrada.nextDouble();

        double Fa = (C * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + Fa + "ºF");

        entrada.close();


    }


}
