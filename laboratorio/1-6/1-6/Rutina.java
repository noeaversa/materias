import java.util.ArrayList;
public class Rutina {
    private String nombre;
    private ArrayList<Instruccion> instrucciones;

    public Rutina(){
        this.nombre = "olo";
        this.instrucciones = new ArrayList<>();
    }

    public void AgregarInstruccion(Instruccion instruccion){
        this.instrucciones.add(instruccion);
    }

    public ArrayList<Instruccion> getInstrucciones() {
        return instrucciones;
    }
}
