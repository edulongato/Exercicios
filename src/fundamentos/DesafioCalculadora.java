package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Insira o 1º numero: ");
        num1 = scanner.nextInt();

        System.out.println("Insira o 2º numero: ");
        num2 = scanner.nextInt();

        System.out.println("Insira a operação desejada: +, - , x, /");
        String op = scanner.next();

        //Lógica
        
        int resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "x".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;


        System.out.printf("%d %s %d = %d", num1, op, num2, resultado);


        scanner.close();

    }
}
