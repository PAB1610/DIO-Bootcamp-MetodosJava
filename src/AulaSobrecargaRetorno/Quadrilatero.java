package AulaSobrecargaRetorno;
/**Exemplos de metodos sobrecarregados*/
public class Quadrilatero {

/* //exemplo metodos sem retorno
    public static void areaQuadrilatero(double lado){
       // return lado = Math.pow(lado, 2); // utilizando potencia
        System.out.println("Quadrado:" + (lado * lado));
    }

    public static void areaQuadrilatero(double lado1, double lado2){
        System.out.println("Retangulo:" + (lado1 * lado2));
    }

    public static void areaQuadrilatero(double lado1, double lado2, double altura){
        double area = (lado1 + lado2)/2 * altura;
        System.out.println("Trapézio:" + (area));
    }*/

    public static String areaQuadrilatero(double lado){
        // return lado = Math.pow(lado, 2); // utilizando potencia
        return "Quadrado: " + (lado * lado);
    }

    public static double areaQuadrilatero(double lado1, double lado2){
        return (lado1 * lado2);
    }

    public static float areaQuadrilatero(double lado1, double lado2, double altura){
        double area = (lado1 + lado2)/2 * altura;
        return (float) area;
    }

}
