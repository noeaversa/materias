import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Perro extends  Mascota{
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean CumplioLasAsistenciasAnuales(){
        HashSet<LocalDateTime> asistencias = retornarVisitasDeEsteAño();
        if((asistencias.size() - 1) >= 4) return true;
        return false;
    }

    public boolean tieneAsistenciaPerfecta(){
        HashMap<Integer, Integer> asistenciasTotales = retornarVisitasPorAño();
        for (Integer añoAuxiliar : asistenciasTotales.keySet()){
            if(asistenciasTotales.get(añoAuxiliar) < 4) return false;
        }
        return true;
    }

    public String razaQueNoCumplioLaAsistencia(){
        if(!CumplioLasAsistenciasAnuales()) return this.raza;
        return null;
    }
}
