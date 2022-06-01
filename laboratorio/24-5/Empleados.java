
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Empleados extends Persona{
    private ArrayList<String> diasLaboralesNombre;
    private LocalDateTime horarioLaboral;
    private ArrayList<LocalDateTime> ingresos;

    public Empleados(){
        super();
        this.diasLaboralesNombre = new ArrayList<>();
        this.horarioLaboral.now();
        this.ingresos = new ArrayList<>();
    }

    public ArrayList<String> getDiasLaboralesNombre() {
        return diasLaboralesNombre;
    }

    public void setDiasLaboralesNombre(ArrayList<String> diasLaboralesNombre) {
        this.diasLaboralesNombre = diasLaboralesNombre;
    }

    public LocalDateTime getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(LocalDateTime horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }

    public ArrayList<LocalDateTime> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<LocalDateTime> ingresos) {
        this.ingresos = ingresos;
    }

    public boolean terminaEn30(int valorDias){
        if(valorDias == 1 || valorDias == 3 || valorDias == 5 || valorDias == 7 || valorDias == 8 || valorDias == 10 || valorDias == 12){
            return false;
        } else return true;
    }

    public int porcentajeAsistencia(int mes){
        int porcentaje = 0, suma = 0;
        for(LocalDateTime i : this.ingresos){
            if(i.getMonth().getValue() == mes){
                suma ++;
            }
        }
        if (!terminaEn30(mes)){
            porcentaje = (suma * 100) / 31;
        }
        else porcentaje = (suma * 100) / 30;
        return  porcentaje;
    }

}
