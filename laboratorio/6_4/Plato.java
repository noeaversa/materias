public class Plato {
    private String nombre;
    private float precio;

    public Plato() {
        this.nombre = "Julian";
        this.precio = 1000f;
    }

    public Plato(String nombrePlato, float precio){
        this.nombre = nombrePlato;
        this.precio = precio;
    }

    public Plato(String nombre) {
        this.nombre = nombre;
        this.precio = 2891f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
