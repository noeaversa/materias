import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        String opcionElegida = "a";
        sistemaRegistroPersonas sistemaPersona = new sistemaRegistroPersonas();
        while (true) {
            System.out.println("Que desea hacer?");
            System.out.println("A. realizar el alta de una persona (registrarla)");
            System.out.println("B. realizar la baja de una persona (eliminarla del registro)");
            System.out.println("M. Realizar alguna modificacion de los datos");
            System.out.println("C. Ver nombres de personas con mas de 18");
            System.out.println("D. Ver todos los datos de las personas registradas");
            System.out.println("S. Salir");
            Scanner ingresoOpciones = new Scanner(System.in);
            opcionElegida = ingresoOpciones.nextLine();

            if (opcionElegida.equals("A") || opcionElegida.equals("a")) {
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
                sistemaPersona.agregarPersona(p1);
            } else if (opcionElegida.equals("B") || opcionElegida.equals("b")) {
                int dni, size, counter = 0;
                System.out.println("Ingrese el dni de la persona a eliminar:");
                Scanner ingresoDni = new Scanner(System.in);
                dni = ingresoDni.nextInt();
                size = sistemaPersona.getSize();

                while (counter < size) {
                    Persona paux = sistemaPersona.getPosition(counter);
                    int dniComparacion = paux.getDni();
                    if (dni == dniComparacion) {
                        sistemaPersona.Remove(counter);
                    }
                    counter++;
                }
            } else if (opcionElegida.equals("M") || opcionElegida.equals("m")) {
                int dniI, size, counter = 0;
                System.out.println("Ingrese el dni de la persona que desea modificar:");
                Scanner ingresoDni = new Scanner(System.in);
                dniI = ingresoDni.nextInt();
                size = sistemaPersona.getSize();

                while (counter < size) {
                    Persona paux = sistemaPersona.getPosition(counter);
                    int dniComparacion = paux.getDni();
                    if (dniI == dniComparacion) {
                        Persona paux1 = sistemaPersona.getPosition(counter);
                        sistemaPersona.Remove(counter);
                        System.out.println("Desea modificar el nombre: (s/n)");
                        Scanner ingresoN = new Scanner(System.in);
                        String respuestaN = ingresoN.nextLine();
                        if (respuestaN.equals("s")) {
                            System.out.println("Nombre: ");
                            Scanner ingresoNombre = new Scanner(System.in);
                            String nombre = ingresoNombre.nextLine();
                            paux1.setNombre(nombre);
                        }
                        System.out.println("Desea modificar la edad: (s/n)");
                        Scanner ingresoE = new Scanner(System.in);
                        String RespuestaE = ingresoE.nextLine();
                        if (RespuestaE.equals("s")) {
                            System.out.println("edad: ");
                            Scanner ingresoEdad = new Scanner(System.in);
                            int edad = ingresoEdad.nextInt();
                            paux1.setEdad(edad);
                        }
                        System.out.println("Desea modificar el dni: (s/n)");
                        Scanner ingresoDNI = new Scanner(System.in);
                        String RespuestaDNI = ingresoDNI.nextLine();
                        if (RespuestaDNI.equals("s")) {
                            System.out.println("dni: ");
                            Scanner ingresoD = new Scanner(System.in);
                            int dni = ingresoD.nextInt();
                            paux1.setDni(dni);
                        }

                        System.out.println("Desea modificar el telefono: (s/n)");
                        Scanner ingresoT = new Scanner(System.in);
                        String respuestaT = ingresoT.nextLine();
                        if (respuestaT.equals("s")) {
                            System.out.println("telefono: ");
                            Scanner ingresoTelefono = new Scanner(System.in);
                            int telefono = ingresoTelefono.nextInt();
                            paux1.setTelefono(telefono);
                        }

                        System.out.println("Desea modificar la direccion: (s/n)");
                        Scanner ingresoDIR = new Scanner(System.in);
                        String respuestaDIR = ingresoDIR.nextLine();
                        if (respuestaDIR.equals("s")) {
                            System.out.println("direccion: ");
                            Scanner ingresoDireccion = new Scanner(System.in);
                            String direccion = ingresoDireccion.nextLine();
                            paux1.setDireccion(direccion);
                        }
                        sistemaPersona.agregarPersona(paux1);
                    }
                    counter++;
                }
            } else if (opcionElegida.equals("C") || opcionElegida.equals("c")) {
                Persona paux = new Persona();
                int counter = 0, size;
                size = sistemaPersona.getSize();

                while (counter < size) {
                    paux = sistemaPersona.getPosition(counter);
                    int edad = paux.getEdad();
                    if (edad > 17) System.out.println(paux.getNombre());
                    counter++;
                }
            } else if (opcionElegida.equals("D") || opcionElegida.equals("d")) {
                Persona paux = new Persona();
                int counter = 0, size;
                size = sistemaPersona.getSize();
                System.out.println(size);
                while (counter < size) {
                    paux = sistemaPersona.getPosition(counter);
                    System.out.println("{" + paux.getNombre() + ", " + paux.getEdad() + ", " + paux.getDni() + ", " + paux.getTelefono() + ", " + paux.getDireccion() + " }");
                    counter++;
                }
            } else if (opcionElegida.equals("s") || opcionElegida.equals("S")) {
                System.out.println("bye!");
                break;
            }
        }
    }
}