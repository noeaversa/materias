import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAlmuerzo extends Pedido{
    private ArrayList<Pedido> pedidos = new ArrayList();
    private ArrayList<Plato> platos = new ArrayList<>();
    public SistemaAlmuerzo(){
        super();
    }
    public SistemaAlmuerzo(LocalDate fechaCreacion, Plato plato, Persona persona, LocalTime horaEntrega, boolean estadoPedido){
        super(fechaCreacion, plato, persona, horaEntrega, estadoPedido);
    }

    public void agregar(){
        System.out.println("ingrese nombre persona que va pedir el pedido:");
        Scanner ingresoNombrePersona = new Scanner(System.in);
        String nombrePersona = ingresoNombrePersona.nextLine();
        Persona persona = new Persona(nombrePersona);

        System.out.println("ingrese el nombre del plato: ");
        Scanner ingresoNombrePlato = new Scanner(System.in);
        String nombrePlato = ingresoNombrePlato.nextLine();
        Plato plato = new Plato(nombrePlato);

        System.out.println("Ingrese el dia de entrega del pedido");
        Scanner ingresoDia = new Scanner(System.in);
        int dia = ingresoNombrePlato.nextInt();

        System.out.println("Ingrese el mes de entrega del pedido");
        Scanner ingresoMes = new Scanner(System.in);
        int mes = ingresoNombrePlato.nextInt();

        System.out.println("Ingrese el año de entrega del pedido");
        Scanner ingresoAño = new Scanner(System.in);
        int año = ingresoNombrePlato.nextInt();
        LocalDate fechaCreacionPedido = LocalDate.of(dia, mes, año);

        System.out.println("Ingrese el minuto de entrega del pedido");
        Scanner ingresoMinuto = new Scanner(System.in);
        int minuto = ingresoMinuto.nextInt();

        System.out.println("Ingrese la hora de entrega del pedido");
        Scanner ingresoHora = new Scanner(System.in);
        int hora = ingresoHora.nextInt();
        LocalTime horaEntrega = LocalTime.of(hora, minuto);

        boolean estado = false;
        Pedido pedidoNuevo = new Pedido(fechaCreacionPedido, plato, persona, horaEntrega, estado);
        this.pedidos.add(pedidoNuevo);

        System.out.println("el indice de la persona agregada es: " + this.pedidos.size());
    }

    public void modificar(){

        Scanner ingresoModificacion = new Scanner(System.in);
        System.out.println("Ingrese indice: ");
        ingresoModificacion = new Scanner(System.in);
        int indice = ingresoModificacion.nextInt();

        Pedido pedido = this.pedidos.get(indice);
        this.pedidos.remove(indice);
        System.out.println("que quiere modificar? (P, N, F, H, E)");
        String opcionModificar = ingresoModificacion.nextLine();

        switch (opcionModificar) {
            case "P":
                System.out.println("Ingrese nombre persona: ");
                ingresoModificacion = new Scanner(System.in);
                String nombreCambiado = ingresoModificacion.nextLine();
                Persona personaCambiada = new Persona(nombreCambiado);
                pedido.setPersona(personaCambiada);

            case "N":
                System.out.println("Ingrese nombre plato: ");
                ingresoModificacion = new Scanner(System.in);
                String nombrePlato = ingresoModificacion.nextLine();
                Plato platoNuevo = new Plato(nombrePlato);
                pedido.setPlato(platoNuevo);
            case "F":
                System.out.println("Ingrese año entrega: ");
                ingresoModificacion = new Scanner(System.in);
                int auxAño = ingresoModificacion.nextInt();

                System.out.println("Ingrese mes entrega: ");
                ingresoModificacion = new Scanner(System.in);
                int auxMes = ingresoModificacion.nextInt();

                System.out.println("Ingrese dia entrega: ");
                ingresoModificacion = new Scanner(System.in);
                int auxDia = ingresoModificacion.nextInt();

                LocalDate fechaAux = LocalDate.of(auxAño, auxMes, auxDia);
                pedido.setFechaCreacion(fechaAux);
            case "H":
                System.out.println("Ingrese hora entrega: ");
                ingresoModificacion = new Scanner(System.in);
                int auxHora = ingresoModificacion.nextInt();

                System.out.println("Ingrese minuto entrega: ");
                ingresoModificacion = new Scanner(System.in);
                int auxMinuto = ingresoModificacion.nextInt();

                LocalTime horaAux = LocalTime.of(auxHora, auxMinuto);

                pedido.setHoraEntrega(horaAux);
            case "E":
                System.out.println("Ingrese estado: ");
                ingresoModificacion = new Scanner(System.in);
                boolean estadoAux = ingresoModificacion.nextBoolean();

                pedido.setEstadoPedido(estadoAux);
        }
        this.pedidos.add(pedido);
        System.out.println("Su nuevo indice es: " + this.pedidos.size());
    }
    public void eliminar(){
        Scanner ingresoEliminar = new Scanner(System.in);
        System.out.println("Ingrese indice a eliminar: ");
        int indice = ingresoEliminar.nextInt();
        pedidos.remove(indice);
    }

    public void imprimirInforme(){
        LocalDate fechaPlatos = LocalDate.now();
        for(Pedido i: this.pedidos){
            if(i.getFechaCreacion().equals(fechaPlatos)){
               Plato platoImprimir = i.getPlato();
                System.out.println("nombre plato: " + platoImprimir.getNombre());
                System.out.println("Precio plaro: " + platoImprimir.getPrecio());
            }

        }
    }


    public void menu(){
        String opcionELegida;
        System.out.println("Opciones: ");
        System.out.println("A. Agregar pedido");
        System.out.println("B. Modificar pedido");
        System.out.println("C. Eliminar pedido");
        System.out.println("D. Imprimir Informe");
        Scanner ingresoOpciones = new Scanner(System.in);
        opcionELegida = ingresoOpciones.nextLine();

        switch (opcionELegida){
            case "a":
                agregar();
            case "b":
                modificar();
            case "c":
                eliminar();
            case "d":
                imprimirInforme();
        }
    }
}
