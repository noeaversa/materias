import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {
    private int id;
    private HashMap<Libro, Integer> cantidadCompra;
    private String nombre;
    private float edad;
    private ArrayList<Libro> librosComprados;


    public Cliente(int id, String nombre, float edad, ArrayList<Libro> librosComprados) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.librosComprados = librosComprados;
        cantidadCompra = new HashMap<>();
    }

    public Cliente(ArrayList<Libro> librosComprados){
        this.id = 2;
        this.nombre = "tomate";
        this.edad = 12;
        this.librosComprados = librosComprados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    public int getSize(){
        return librosComprados.size();
    }

    public HashMap<Libro, Integer> getCantidadCompra() {
        return cantidadCompra;
    }

    public ArrayList<Libro> getLibrosComprados() {
        return librosComprados;
    }
}
