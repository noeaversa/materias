import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String RTAW = "s", RTAW2 = "s";
        float precio, precioAux = 0;
        while (RTAW.equals("s")){
            System.out.println("Ingrese nombre del producto: ");
            Scanner registroN = new Scanner(System.in);
            String Nombre = registroN.nextLine();

            System.out.println("Ingrese el precio del producto: ");
            Scanner registroP = new Scanner(System.in);
            precio = registroP.nextFloat();

            Producto p1 = new Producto(Nombre, precio);

            System.out.println("Desea ingresar mas productos? (s/n)");
            Scanner RTA = new Scanner(System.in);
            RTAW = RTA.nextLine();
            precioAux += precio;
        }

        System.out.println("El importe a pagar es: " + precioAux);

        System.out.println("desea agregar nuevos productos? (s/n)");
        Scanner RTA2 = new Scanner(System.in);
        RTAW2 = RTA2.nextLine();

        while (RTAW2.equals("s")){
            RTAW = "s";
            while (RTAW.equals("s")){
                System.out.println("Ingrese nombre del producto: ");
                Scanner registroN = new Scanner(System.in);
                String Nombre = registroN.nextLine();

                System.out.println("Ingrese el precio del producto: ");
                Scanner registroP = new Scanner(System.in);
                precio = registroP.nextFloat();

                Producto p1 = new Producto(Nombre, precio);

                System.out.println("Desea ingresar mas productos? (s/n)");
                Scanner RTA = new Scanner(System.in);
                RTAW = RTA.nextLine();
                precioAux += precio;
            }
            System.out.println("El importe a pagar es: " + precioAux);

            System.out.println("desea agregar nuevos productos al registro? (s/n)");
            Scanner RTA3 = new Scanner(System.in);
            RTAW2 = RTA3.nextLine();
        }

        System.out.println("El importe total es: " + precioAux);

    }
}
