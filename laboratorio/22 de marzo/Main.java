import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opciones1 = 0;
        while(opciones1 < 3){
            System.out.println("1. Ingrese Cliente");
            System.out.println("2. Libro");
            System.out.println("3. Sistema de libreria");
            System.out.println("4. Salir");
            Scanner ingresoOpciones = new Scanner(System.in);
            opciones1 = ingresoOpciones.nextInt();

            if(opciones1 == 1){
                Scanner ingresos;
                int id;
                float edad;
                String nombre;
                ArrayList<Libro> libros;
                System.out.println("Ingrese id");
                ingresos = new Scanner(System.in);
                id = ingresos.nextInt();

                System.out.println("edad:");
                ingresos = new Scanner(System.in);
                edad = ingresos.nextFloat();

                System.out.println("nombre");
                ingresos = new Scanner(System.in);
                nombre = ingresos.nextLine();
            }
        }

    }
}
