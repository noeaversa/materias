
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

    public boolean esImpar(int numero){
        if(numero % 2 == 0) return false;
        else return true;
    }
    public boolean terminaEn30(int valorDias){
        if((valorDias <= 7 && esImpar(valorDias)) || (valorDias > 7 && !esImpar(valorDias))){
            return false;
        } else return true;
    }

    public int porcentajeAsistencia(int mes){
        int porcentaje = 0, suma = 0;
        for(LocalDateTime fechaAux : this.ingresos){
            if(fechaAux.getMonthValue() == mes){
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
