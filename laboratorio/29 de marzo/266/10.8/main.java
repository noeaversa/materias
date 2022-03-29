import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> matriz = new ArrayList<>();
        ArrayList <Integer> fila = new ArrayList<>();
        ArrayList<Integer> fila1 = new ArrayList<>();
        ArrayList<Integer> fila2 = new ArrayList<>();
        ArrayList<Integer> fila3 = new ArrayList<>();

        fila.add(4);
        fila.add(7);
        fila.add(-5);
        fila.add(4);
        fila.add(9);
        matriz.add(fila);

        fila1.add(0);
        fila1.add(3);
        fila1.add(-2);
        fila1.add(6);
        fila1.add(-2);
        matriz.add(fila1);

        fila2.add(1);
        fila2.add(2);
        fila2.add(4);
        fila2.add(1);
        fila2.add(1);
        matriz.add(fila2);

        fila3.add(6);
        fila3.add(1);
        fila3.add(0);
        fila3.add(3);
        fila3.add(-4);
        matriz.add(fila3);

        int suma = 0, sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if(i != j) {
                    suma += matriz.get(i).get(j);
                }
            }
            sumaTotal += suma;
            System.out.print(i + ". ");
            System.out.println(suma);
            suma = 0;
        }
        System.out.println("Suma total: " + sumaTotal);
    }
}
