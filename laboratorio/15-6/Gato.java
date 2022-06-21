import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Gato extends Mascota{
    private String raza;

    public boolean CumplioLasAsistenciasAnuales(){
        HashSet<LocalDateTime> asistencias = retornarVisitasDeEsteAño();
        if((asistencias.size() - 1) >= 2) return true;
        return false;
    }
    public boolean tieneAsistenciaPerfecta(){
        HashMap<Integer, Integer> asistenciasTotales = retornarVisitasPorAño();
        for (Integer añoAuxiliar : asistenciasTotales.keySet()){
            if(asistenciasTotales.get(añoAuxiliar) < 2) return false;
        }
        return true;
    }
}
