import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingresosNumeros, ingresoIngresar;
        HashSet<Integer> numerosHash = new HashSet<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("quiere ingresar numeros? s/n");
        ingresoIngresar = new Scanner(System.in);
        String respuestaIngreso = ingresoIngresar.nextLine();

        while(respuestaIngreso.equals("s")){
            System.out.println("ingrese numero: ");
            ingresosNumeros = new Scanner(System.in);
            int numeroNuevo = ingresosNumeros.nextInt();
            numeros.add(numeroNuevo);

            System.out.println("quiere ingresar mas numeros? s/n");
            respuestaIngreso = ingresoIngresar.nextLine();
        }

        // EJERCICIO 1:
        for (Integer i : numeros){
            for ( Integer j : numeros) {
                if(i != j){
                    numerosHash.add(j);
                }
            }
        }

        System.out.println("Numeros del array puestos solo una vez: ");
        for(Integer i: numerosHash){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Numeros completos del array:");
        for (Integer i: numeros){
            System.out.print(i + " ");
        }

        // EJERCICIO 2:
        numerosHash.clear();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        System.out.println("Ingrese otra lista de numeros: ");
        respuestaIngreso = "s";

        while(respuestaIngreso.equals("s")){
            System.out.println("ingrese numero: ");
            ingresosNumeros = new Scanner(System.in);
            int numeroNuevo = ingresosNumeros.nextInt();
            numeros2.add(numeroNuevo);

            System.out.println("quiere ingresar mas numeros? s/n");
            respuestaIngreso = ingresoIngresar.nextLine();
        }

        for(Integer i : numeros){
            for (Integer j : numeros2){
                if(i == j && !numerosHash.contains(i)) numerosHash.add(i);
            }
        }
        for(Integer i: numerosHash){
            System.out.print(i + " ");
        }
    }
}
