import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Mascota {
    private ArrayList<LocalDateTime> fechasControl;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String dueño;


    public ArrayList<LocalDateTime> getFechasControl() {
        return fechasControl;
    }

    public void setFechasControl(ArrayList<LocalDateTime> fechasControl) {
        this.fechasControl = fechasControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public boolean esDeEsteAño(LocalDateTime fechaRecibida, int año){
        if(fechaRecibida.getYear() == año) return true;
        return false;
    }
    public HashSet<LocalDateTime> retornarVisitasDeEsteAño(){
        HashSet<LocalDateTime> hashSetRetorno = new HashSet<>();
        for(LocalDateTime auxiliar : this.fechasControl){
            if(esDeEsteAño(auxiliar, 2022))
                hashSetRetorno.add(auxiliar);
        }
        return hashSetRetorno;
    }

    public int retornarCantidadDeVisitas(int año){
        int visitas = 0;
        for(LocalDateTime auxiliar : this.fechasControl){
            if(auxiliar.getYear() == año) visitas++;
        }
        return visitas;
    }
    public HashMap<Integer, Integer> retornarVisitasPorAño(){
        int cantidad;
        HashMap<Integer, Integer> hashMapARetornar = new HashMap<>();
        for(LocalDateTime auxiliar : this.fechasControl){
            hashMapARetornar.put(auxiliar.getYear(), retornarCantidadDeVisitas(auxiliar.getYear()));
        }
        return hashMapARetornar;
    }
}
