import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaLibreria {
    private HashSet<Cliente> clientes;
    private ArrayList<Libro> libroVenta;
    private ArrayList<Integer> cantidadLibros;
    private ArrayList<Integer> id;
    private String nombre;
    private HashSet<String> editorialesConDescuento;
    private HashMap<Cliente, Float> ventas;


    public SistemaLibreria(ArrayList<Cliente> clientes, ArrayList<Libro> libroVenta, ArrayList<Integer> cantidadLibros, ArrayList<Integer> id, String nombre) {
        this.clientes = new HashSet<>();
        this.libroVenta = libroVenta;
        this.cantidadLibros = cantidadLibros;
        this.id = id;
        this.nombre = nombre;
        this.editorialesConDescuento = new HashSet<>();
        this.ventas = new HashMap<>();
    }

    public SistemaLibreria(ArrayList<Cliente> clientes, ArrayList<Libro> libroVenta, ArrayList<Integer> cantidadLibros, ArrayList<Integer> id) {
        this.clientes = new HashSet<>();
        this.libroVenta = libroVenta;
        this.cantidadLibros = cantidadLibros;
        this.id = id;
        this.nombre = "Pepe";

    }
    public SistemaLibreria(){
        this.nombre = " ";
    }
    public SistemaLibreria(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarLibrosComprados(int id){
        for(Cliente i: this.clientes){
            if(i.getId() == id){
                System.out.println("Libros comprados: " + i.getLibrosComprados());
                System.out.println("Cantidad " + i.getCantidadCompra());
            }

        }
    }

    public void agregarEditorialesConDescuento(String nombreEditorial) {
        editorialesConDescuento.add(nombre);
    }

    public ArrayList<Float> precioLibros(){
        ArrayList<Float> precio = new ArrayList<>();
        return precio;
    }


    public ArrayList<Cliente> clientesFrecuentes(){
        ArrayList<Cliente> frecuentes = new ArrayList<>();
        for (Cliente i : this.clientes){
            if(i.getSize() > 10){
                frecuentes.add(i);
            }
        }
        return frecuentes;
    }


    public ArrayList<Integer> librosMasVendidos(){
        ArrayList<Integer> masVendidos = new ArrayList<>();
        for(Integer i: this.cantidadLibros){
            if(i < 100){
                masVendidos.add(i);
            }
        }
        return masVendidos;
    }

    public ArrayList<Float> edadesClientesFrecuentes(){
        ArrayList<Float> edades = new ArrayList<>();
        for(Cliente i: this.clientes){
            if(i.getSize() > 10){
                float edad = i.getEdad();
                edades.add(edad);
            }
        }
        return edades;
    }

}
