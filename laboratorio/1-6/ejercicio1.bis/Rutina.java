import java.util.HashMap;

public class Rutina {
    private String nombre;
    private HashMap<String, Integer> instrucciones;

    public Rutina(){
        this.instrucciones = new HashMap<>();
        this.nombre = "A";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Integer> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(HashMap<String, Integer> instrucciones) {
        this.instrucciones = instrucciones;
    }
}
