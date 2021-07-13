package fundamentos;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.pow;

public class CalculoIMC {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("###,##");

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu peso: ");
        String peso = sc.next();
        peso = sc.next().replace(",", ".");

        System.out.print("Insira sua altura: ");
        String altura = sc.next();
        altura = sc.next().replace(",", ".");


        double Peso, Altura;
        Peso = Double.parseDouble(peso);
        Altura = Double.parseDouble(altura);
        Altura = Math.pow(Altura, 2);



        double IMC = Peso / Altura;

        System.out.print("Seu IMC é: " + decimalFormat.format(IMC));

        sc.close();



    }
}
