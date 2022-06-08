import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Banco {
    private String nombre;
    private String direccion;
    private ArrayList<Cliente> visitantesClientes;
    private HashMap<LocalDateTime, String> fechaOperaciones;
    private ArrayList<Caja> cajas;


    public Banco(){
        this.nombre = "hola";
        this.direccion = "ewdiugh";
        this.visitantesClientes = new ArrayList<>();
        this.fechaOperaciones = new HashMap<>();
        this.cajas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getVisitantesClientes() {
        return visitantesClientes;
    }

    public void setVisitantesClientes(ArrayList<Cliente> visitantesClientes) {
        this.visitantesClientes = visitantesClientes;
    }

    public HashMap<LocalDateTime, String> getFechaOperaciones() {
        return fechaOperaciones;
    }

    public void setFechaOperaciones(HashMap<LocalDateTime, String> fechaOperaciones) {
        this.fechaOperaciones = fechaOperaciones;
    }

    public HashSet<Integer> cbusDeClientesVisitantes(){
        HashSet<Integer> cbuClientes = new HashSet<>();
        for (Cliente aux : this.visitantesClientes){
            cbuClientes.add(aux.getCbu());
        }
        return cbuClientes;
    }

    public void imprimirElementosHashSet(){
        HashSet<Integer> elementos = cbusDeClientesVisitantes();
        for(Integer i : elementos){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }


    public HashMap<Integer, Integer> cantidadDeVisitasPorCliente(){
        HashMap<Integer, Integer> hashMapAEntregar = new HashMap<>();
        for(Cliente aux: this.visitantesClientes){
            hashMapAEntregar.put(aux.getCbu(), apariciones(aux));
        }
        return hashMapAEntregar;
    }

    public void ImprimirHasmap(){
        HashMap<Integer, Integer> hasMapImpreso = cantidadDeVisitasPorCliente();
        for(Integer i : hasMapImpreso.keySet()){
            System.out.println("Clave: " + hasMapImpreso.containsKey(i) + " - valor: " + hasMapImpreso.containsValue(i));
        }
    }
    public Integer apariciones (Cliente cliente){
        Integer apariciones = 0;
        for (Cliente aux: visitantesClientes){
            if(cliente.getCbu() == aux.getCbu()) apariciones += 1;
        }
        return apariciones;
    }
    // -----------------------------------------------8 de junio -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void crearCuenta(int cbu, String nombre, int dni){
        Cliente clienteNuevo = new Cliente(cbu, nombre, dni);
        this.visitantesClientes.add(clienteNuevo);
        agregarOperacion("creacion cuenta");
    }

    public void agregarOperacion(String nombreOperacion){
        this.fechaOperaciones.put(LocalDateTime.now(), nombreOperacion);
    }
    public void depositarDinero(int dineroADepositar, Cliente clienteQueDeposita) {
        this.visitantesClientes.remove(clienteQueDeposita);
        clienteQueDeposita.setDineroCliente(clienteQueDeposita.getDineroCliente() + dineroADepositar);
        this.visitantesClientes.add(clienteQueDeposita);
        agregarOperacion("deposito");
    }

    public void extraerDinero(int dineroAExtraer, Cliente clienteQueExtrae){
        this.visitantesClientes.remove(clienteQueExtrae);
        clienteQueExtrae.setDineroCliente(clienteQueExtrae.getDineroCliente() - dineroAExtraer);
        this.visitantesClientes.add(clienteQueExtrae);
        agregarOperacion("extraccion");
    }

   // el punto 3 te lo resuelven los getters

    public void ticket(int clienteId){
        Caja cajaAtendida = this.cajas.get(0);
        System.out.println("Nombre del banco: " + this.nombre);
        System.out.println("Direccion del banco: " + this.direccion);
        System.out.println("CUIT cliente: " + this.visitantesClientes.get(clienteId).getCbu());
        System.out.println("Datos operacion: " + this.fechaOperaciones.containsKey(LocalDateTime.now()));
        System.out.println("Saldo restante: " + this.visitantesClientes.get(clienteId).getDineroCliente());
        System.out.println("caja: " + cajaAtendida);
        if(!cajaAtendida.isEsAutomatica()){
            System.out.println("Nombre de la persona que te atendio: " + cajaAtendida.getPersonaQueAtiende().getNombre());
        }
    }

    public void ingresarSatisfaccion(int clienteId){
        Cliente cliente = this.visitantesClientes.get(clienteId);
        System.out.println("Ingrese su satisfaccion: ");
        Scanner satisfaccionIngreso = new Scanner(System.in);
        cliente.setSatisfaccion(satisfaccionIngreso.nextLine());
    }
}
