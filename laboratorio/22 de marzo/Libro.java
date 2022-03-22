public class Libro {
    private int id;
    private String nombre;
    private float precio;
    private String editorial;

    public Libro(int id, String nombre, float precio, String editorial) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.editorial = editorial;
    }

    public Libro(){
        this.id = 91902;
        this.nombre = "La Rosalia";
        this.precio = 19.4f;
        this.editorial = "Kapelusz";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
