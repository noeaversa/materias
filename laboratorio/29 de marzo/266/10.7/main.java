import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> matriz = new ArrayList<>();
        ArrayList <Integer> fila = new ArrayList<>();
        ArrayList<Integer> fila1 = new ArrayList<>();
        ArrayList<Integer> fila2 = new ArrayList<>();

        fila.add(4);
        fila.add(7);
        fila.add(1);
        fila.add(3);
        fila.add(5);
        matriz.add(fila);

        fila1.add(2);
        fila1.add(0);
        fila1.add(6);
        fila1.add(9);
        fila1.add(7);
        matriz.add(fila1);

        fila2.add(3);
        fila2.add(1);
        fila2.add(2);
        fila2.add(6);
        fila2.add(4);
        matriz.add(fila2);

        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 3; j++){
                Integer aux = matriz.get(j).get(i);
                System.out.print(aux);
            }
            System.out.println();
        }

    }
}
