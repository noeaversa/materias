import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Libro> librosArray = new ArrayList<>();
        ArrayList<Integer> cantidad = new ArrayList<>();
        ArrayList<Cliente> clienteArray = new ArrayList<>();
        ArrayList<Integer> idArray = new ArrayList<>();
        Scanner ingresos;
        String letra;
        int opciones = 0;
        System.out.println("quiere ingresar un libro? (1/2)");
        ingresos = new Scanner(System.in);
        opciones = ingresos.nextInt();

        while (opciones == 1){
            System.out.println("id: ");
            ingresos = new Scanner(System.in);
            int id = ingresos.nextInt();

            System.out.println("nombre: ");
            ingresos = new Scanner(System.in);
            String nombre = ingresos.nextLine();

            System.out.println("Precio: ");
            ingresos = new Scanner(System.in);
            float precio = ingresos.nextFloat();

            System.out.println("Editorial: ");
            ingresos = new Scanner(System.in);
            String editorial = ingresos.nextLine();

            Libro aux = new Libro(id, nombre, precio, editorial);
            librosArray.add(aux);

            System.out.println("quiere ingresar un libro mas? (1/2)");
            ingresos = new Scanner(System.in);
            opciones = ingresos.nextInt();
        }

        Cliente clienteAux = new Cliente(librosArray);
        Cliente clienteAux1 = new Cliente(librosArray);
        Cliente clienteAux3 = new Cliente(librosArray);

        clienteArray.add(clienteAux);
        clienteArray.add(clienteAux1);
        clienteArray.add(clienteAux3);
        SistemaLibreria libreria = new SistemaLibreria(clienteArray, librosArray, cantidad, idArray);

        for(Cliente i: clienteArray){
           if(i.getSize() > 10){
               System.out.println("Cliente frecuente: ");
               System.out.println(i.getNombre());
           }
        }


        int counter = 0;
        float auxiliarEdad = 0;

        for (Cliente i : clienteArray){
            for(Cliente j: clienteArray){
                if(j.getEdad() == i.getEdad()){
                    counter++;
                    if(counter > 10 && auxiliarEdad != i.getEdad()){
                        System.out.println("edad frecuente: ");
                        System.out.println(i.getEdad());
                        auxiliarEdad = i.getEdad();
                        break;
                        }
                    }
                }
                counter = 0;
            }

        for (Libro i: librosArray){
            if (i.getPrecio() > 5500.50){
                System.out.println("Libro con precio mayor a $5500,50: " + i.getNombre());
            }

            System.out.println("ingrese una letra: ");
            ingresos = new Scanner(System.in);
            letra = ingresos.nextLine();

            String letraComparacion = i.getNombre();
            if(letra.charAt(0) == letraComparacion.charAt(0)){
                System.out.println(letraComparacion);
            }else System.out.println("No hay libros con ese nombre");
            System.out.println("Editoriales: ");
            if (i.getEditorial().equals("ElAteneo") || i.getEditorial().equals("Interzona") || i.getEditorial().equals("Sur y Alianza")) {
                System.out.println(i.getNombre() + " (" + i.getPrecio() / 2 + ") ");
            }
            System.out.println("ingrese el id del libro: ");
            ingresos = new Scanner(System.in);
            int idLibroModificar = ingresos.nextInt();

            int descuento = 0;
            System.out.println("ingrese el porcentaje de descuento: ");
            ingresos = new Scanner(System.in);
            descuento = ingresos.nextInt();
            if (idLibroModificar == i.getId()) {
                float precioOriginal = i.getPrecio();
                i.setPrecio(precioOriginal - ((precioOriginal * descuento) / 100));
                System.out.println(i.getPrecio());
            }

        }

        System.out.println("DESCUENTO DE NAVIDAD? (s/n)");
        ingresos = new Scanner(System.in);
        letra = ingresos.nextLine();
        if(letra.equals("s")){
            for(Libro i : librosArray){
                if(i.getId() % 2 == 0){
                    float precioOriginal = i.getPrecio();
                    i.setPrecio(precioOriginal - ((precioOriginal * 25) / 100));
                    System.out.println(i.getPrecio());
                }else{
                    float precioOriginal = i.getPrecio();
                    i.setPrecio(precioOriginal - ((precioOriginal * 35) / 100));
                    System.out.println(i.getPrecio());
                }
            }
        }
    }
}

