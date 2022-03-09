import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Ingrese el nombre de la persona: ");
        Scanner ingresoN = new Scanner(System.in);
        String Nombre = ingresoN.nextLine();

        System.out.println("Ingrese la edad de la persona: ");
        Scanner ingresoE = new Scanner(System.in);
        int edad = ingresoE.nextInt();

        System.out.println("Ingrese el DNI de la persona: ");
        Scanner ingresoDNI = new Scanner(System.in);
        int dni = ingresoDNI.nextInt();

        System.out.println("Ingrese el telefono de la persona: ");
        Scanner ingresoT = new Scanner(System.in);
        int telefono = ingresoT.nextInt();

        System.out.println("Ingrese la direccion de la persona: ");
        Scanner ingresoD = new Scanner(System.in);
        String direccion = ingresoD.nextLine();

        Persona p1 = new Persona(Nombre, edad, dni, telefono, direccion);

        System.out.println(" ");
        System.out.println("Los datos de la persona son:");
        System.out.println("{" + p1.getNombre() + ", " + p1.getEdad() + ", " + p1.getDni() + ", " + p1.getTelefono() + ", " + p1.getDireccion() + "}");

        System.out.println(" ");
        System.out.println("Desea cambiar los datos de la persona? (s/n)");
        Scanner ingresoRTA = new Scanner(System.in);
        String Rta = ingresoRTA.nextLine();

        if(Rta.equals("s")){
            System.out.println("Desea cambiar el nombre? (s/n)");
            Scanner ingresoRN = new Scanner(System.in);
            String RN = ingresoRN.nextLine();
            if(RN.equals("s")){
                System.out.println("Ingrese el nuevo nombre:");
                Scanner ingresoNN = new Scanner(System.in);
                Nombre = ingresoNN.nextLine();
                p1.setNombre(Nombre);
            }

            System.out.println("Desea cambiar la edad? (s/n)");
            Scanner ingresoRE = new Scanner(System.in);
            String RE = ingresoRE.nextLine();
            if(RE.equals("s")){
                System.out.println("Ingrese la nueva edad:");
                Scanner ingresoNE = new Scanner(System.in);
                edad = ingresoNE.nextInt();
                p1.setEdad(edad);
            }

            System.out.println("Desea cambiar el dni? (s/n)");
            Scanner ingresoRDN = new Scanner(System.in);
            String RDN = ingresoRDN.nextLine();
            if(RDN.equals("s")){
                System.out.println("Ingrese el nuevo dni:");
                Scanner ingresoNDNI = new Scanner(System.in);
                dni = ingresoNDNI.nextInt();
                p1.setDni(dni);
            }

            System.out.println("Desea cambiar el telefono? (s/n)");
            Scanner ingresoRT = new Scanner(System.in);
            String RT = ingresoRT.nextLine();
            if(RT.equals("s")){
                System.out.println("Ingrese el nuevo telefono:");
                Scanner ingresoNT = new Scanner(System.in);
                telefono = ingresoNT.nextInt();
                p1.setTelefono(telefono);
            }

            System.out.println("Desea cambiar la direccion? (s/n)");
            Scanner ingresoRD = new Scanner(System.in);
            String RD = ingresoRD.nextLine();
            if(RD.equals("s")){
                System.out.println("Ingrese la nueva direccion:");
                Scanner ingresoNN = new Scanner(System.in);
                direccion = ingresoNN.nextLine();
                p1.setDireccion(direccion);
            }
            System.out.println(" ");
            System.out.println("Los nuevos datos son: ");
            System.out.println("{" + p1.getNombre() + ", " + p1.getEdad() + ", " + p1.getDni() + ", " + p1.getTelefono() + ", " + p1.getDireccion() + "}");
        }
    }
}
