import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nombre;
    private float edad;
    private ArrayList<Libro> librosComprados;


    public Cliente(int id, String nombre, float edad, ArrayList<Libro> librosComprados) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
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


}
