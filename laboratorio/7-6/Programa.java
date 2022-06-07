import java.time.LocalDateTime;
import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Horario horario;
    private ArrayList<Conductor> conductores;

    public Programa() {
        this.nombre = "Radio Disney";
        this.horario = new Horario();
        this.conductores = new ArrayList<>();
    }

    public void cargaConductores(Conductor conductor){
        this.conductores.add(conductor);
    }

    public void cargaPrograma(Horario horario, String nombre, Conductor conductor, LocalDateTime hora){
        cargaConductores(conductor);
        if(!horario.seRepiteHorario(hora)){
            horario.getBloque().put(hora, "Bloque 4");
        }
    }
}
