import static java.lang.Math.PI;
public class Area {
    public static double radio = 15;
    public static double lado = 10;

    public static double CirculoArea(){
        double area = PI * radio * radio;
        return area;
    }

    public static double EsferaArea(){
        double area = 4 * PI * radio * radio;
        return area;
    }

    public static double CuadradoArea(){
        double area = lado * lado;
        return area;
    }

    public static double CuboArea(){
        double area = 6 * lado * lado;
        return area;
    }

    public static double TrianguloArea(double base, double altura){
        double area = (base * altura) / 2;
        return area;
    }
}
