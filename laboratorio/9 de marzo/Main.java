import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        System.out.println("Que desea hacer?");
        System.out.println("A. realizar el alta de una persona (registrarla)");
        System.out.println("B. realizar la baja de una persona (eliminarla del registro)");
        System.out.println("M. Realizar alguna modificacion de los datos");
        Scanner ingresoOpciones = new Scanner(System.in);
        String opcionElegida = ingresoOpciones.nextLine();

        if(opcionElegida.equals("A")){
            System.out.println("Ingrese los siguientes datos:");
            System.out.println("Nombre: ");
            Scanner ingresoNombre = new Scanner(System.in);
            String nombre = ingresoNombre.nextLine();

            System.out.println("Edad: ");
            Scanner ingresoEdad = new Scanner(System.in);
            int edad = ingresoEdad.nextInt();

            System.out.println("DNI: ");
            Scanner ingresoDNI = new Scanner(System.in);
            int dni = ingresoDNI.nextInt();

            System.out.println("Telefono: ");
            Scanner ingresoTel = new Scanner(System.in);
            int telefono = ingresoTel.nextInt();

            System.out.println("Direccion: ");
            Scanner ingresoDir = new Scanner(System.in);
            String direccion = ingresoDir.nextLine();

            Persona p1 = new Persona(nombre, edad, dni, telefono, direccion);

            sistemaRegistroPersonas personas = new sistemaRegistroPersonas(p1);
        }

    }
}
