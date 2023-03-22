package AulaSobrecargaRetorno;



public class MainQ {
    public static void main(String[] args) {

        System.out.println(Quadrilatero.areaQuadrilatero(4)); //quadrado
        System.out.println("Retangulo: " + Quadrilatero.areaQuadrilatero(5, 9)); //retangulo
        System.out.println("Trapezio: " + Quadrilatero.areaQuadrilatero(5,7,10)); //trapezio


    }
}
