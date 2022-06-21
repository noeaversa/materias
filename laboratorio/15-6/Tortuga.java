import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Tortuga extends Mascota{
    public boolean CumplioLasAsistenciasAnuales(){
        HashSet<LocalDateTime> asistencias = retornarVisitasDeEsteAño();
        if((asistencias.size() - 1) >= 1) return true;
        return false;
    }

    public boolean tieneAsistenciaPerfecta(){
        HashMap<Integer, Integer> asistenciasTotales = retornarVisitasPorAño();
        for (Integer añoAuxiliar : asistenciasTotales.keySet()){
            if(asistenciasTotales.get(añoAuxiliar) < 1) return false;
        }
        return true;
    }
}
