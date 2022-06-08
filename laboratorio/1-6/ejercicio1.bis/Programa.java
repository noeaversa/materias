import java.util.ArrayList;

public class Programa {
    private ArrayList<Rutina> rutinas;

    public Programa(){
        this.rutinas = new ArrayList<>();
    }

    public ArrayList<Rutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(ArrayList<Rutina> rutinas) {
        this.rutinas = rutinas;
    }
}
