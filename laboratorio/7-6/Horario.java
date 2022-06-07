import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Set;

public class Horario {
    private HashMap<LocalDateTime, String> bloque;
    private String nombreProductor;

    public Horario(){
        this.bloque = new HashMap<>();
    }

    public boolean seRepiteHorario(LocalDateTime horarioBloque){
        for(LocalDateTime i : this.bloque.keySet()){
            if(horarioBloque.equals(i)) return true;
        }
        return false;
    }

    public HashMap<LocalDateTime, String> getBloque() {
        return bloque;
    }
}
