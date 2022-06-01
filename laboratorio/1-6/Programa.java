import java.util.ArrayList;

public class Programa {
    private ArrayList<Rutina> rutinas;

    public Programa(){
        this.rutinas = new ArrayList<>();
    }

    public void agregaRutinas(Rutina rutina){
        this.rutinas.add(rutina);
    }

    public ArrayList<Rutina> getRutinas() {
        return rutinas;
    }
}
