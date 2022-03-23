import java.util.ArrayList;

public class SistemaLibreria {
    private ArrayList<Cliente> clientes;
    private ArrayList<Libro> libroVenta;
    private ArrayList<Integer> cantidadLibros;
    private ArrayList<Integer> id;
    private String nombre;


    public SistemaLibreria(ArrayList<Cliente> clientes, ArrayList<Libro> libroVenta, ArrayList<Integer> cantidadLibros, ArrayList<Integer> id, String nombre) {
        this.clientes = clientes;
        this.libroVenta = libroVenta;
        this.cantidadLibros = cantidadLibros;
        this.id = id;
        this.nombre = nombre;
    }

    public SistemaLibreria(ArrayList<Cliente> clientes, ArrayList<Libro> libroVenta, ArrayList<Integer> cantidadLibros, ArrayList<Integer> id) {
        this.clientes = clientes;
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Integer> getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(ArrayList<Integer> cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public ArrayList<Integer> getId() {
        return id;
    }

    public void setId(ArrayList<Integer> id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
