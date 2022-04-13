public class Cancion {
    private String nombre;
    private int duracionSegundos;

    public Cancion(String nombre, int duracionSegundos) {
        this.nombre = nombre;
        this.duracionSegundos = duracionSegundos;
    }

    public Cancion() {
        this.nombre = "Lola";
        this.duracionSegundos = 340;
    }

    public boolean esUnaCancionLarga(){
        if(this.duracionSegundos >= 240) return true;
        else return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }
}
