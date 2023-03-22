package AulaUm;
/**Exemplo metodos para as 4 operações*/
public class Calculadora  {


    public static void somar(double num1, double num2){
        double resultado = num1 + num2;
        System.out.println("a soma é:" + resultado);
    }

    public static void diminuir(double num1, double num2){
        double resultado = num1 - num2;
        System.out.println("a subtração é:" + resultado);
    }

    public static void multiplicar(double num1, double num2){
        double resultado = num1 * num2;
        System.out.println("a multiplicação é:" + resultado);
    }

    public static void dividir(double num1, double num2){
        double resultado = num1 / num2;
        System.out.println("a divisão é:" + resultado);
    }
}
