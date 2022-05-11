import static java.lang.Math.PI;
public class Area {
    public static void main(String[] args) {
        double radio = 2, lado = 3, base = 4, altura = 5;
        double circuloArea = CirculoArea(radio);
        double esferaArea = EsferaArea(radio);
        double cuadradoArea = CuadradoArea(lado);
        double cuboArea = CuboArea(lado);
        double trianguloArea = TrianguloArea(base, altura);
    }

    public static double CirculoArea(double radio){
        double area = PI * radio * radio;
        return area;
    }

    public static double EsferaArea(double radio){
        double area = 4 * PI * radio * radio;
        return area;
    }

    public static double CuadradoArea(double lado){
        double area = lado * lado;
        return area;
    }

    public static double CuboArea(double lado){
        double area = 6 * lado * lado;
        return area;
    }

    public static double TrianguloArea(double base, double altura){
        double area = (base * altura) / 2;
        return area;
    }
}
