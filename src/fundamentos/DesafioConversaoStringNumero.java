package fundamentos;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DesafioConversaoStringNumero {

    public static void main(String[] args) {

        /*
        3 strings nextline();
        ultimos 3 salários de um funcionario, calcular a média dos ultimos 3 salários
         */
        DecimalFormat df = new DecimalFormat("0,000");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º salário: $");
        String sal1 = scanner.next().replace(",", ".");

        System.out.print("Digite o 2º salário: $");
        String sal2 = scanner.next().replace(",", ".");

        System.out.print("Digite o 3º salário: $");
        String sal3 = scanner.next().replace(",", ".");

        //Converte String para Double.
        double salario1 = Double.parseDouble(sal1);
        double salario2 = Double.parseDouble(sal2);
        double salario3 = Double.parseDouble(sal3);

        double soma = salario1 + salario2 + salario3;

        System.out.println("A soma dos salários é : $" + df.format(soma));
        System.out.println("A média dos últimos 3 salários é: $" + df.format(soma/3));

        scanner.close();






    }
}
