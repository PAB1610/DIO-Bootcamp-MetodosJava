package AulaUm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        //Calculadora
        System.out.println("Digite 2 valores");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("RESULTADOS");
        Calculadora.somar(num1, num2);
        Calculadora.diminuir(num1, num2);
        Calculadora.multiplicar(num1, num2);
        Calculadora.dividir(num1, num2);
        */

        //Mensagem
    /*    System.out.println("Digite a hora");
        int hora = scanner.nextInt();
        Mensagem.obterMensagem(hora);*/


        //Emprestimo
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}