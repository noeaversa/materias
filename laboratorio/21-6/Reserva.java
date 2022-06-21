import java.time.LocalDate;
import java.util.HashSet;

public class Reserva{
    private HashSet<Fecha_Reserva> fecha_reservas;
    private HashSet<Persona> personasQuehicieronReservas;

    public Reserva(){

        this.fecha_reservas = new HashSet<>();
        this.personasQuehicieronReservas = new HashSet<>();
    }

    public boolean horarioEstaDisponible(LocalDate fecha, int bloque){
        for(Fecha_Reserva fechaAuxiliar : this.fecha_reservas){
            if(fechaAuxiliar.getFecha() == fecha && fechaAuxiliar.getBloque() == bloque) return false;
        }
        return true;
    }

    public int PrioridadDeLaPersonaSegunHorario(LocalDate fecha, int bloque){
        if(!horarioEstaDisponible(fecha, bloque)){
        // se pone esta condicion ya que esta buscando algo dentro del hashSet y si no esta el horario se usa un for para nada porque el horario no esta reservado
            for (Fecha_Reserva fechaAuxiliar : this.fecha_reservas){
                if(fechaAuxiliar.getFecha() == fecha && fechaAuxiliar.getBloque() == bloque){
                    return fechaAuxiliar.getPersonaQueRealizoLaReserva().getPrioridad();
                }
            }
        }
        return 0;
    }

    public void guardarReserva(Persona personaNueva, Fecha_Reserva fechaNueva){
        this.fecha_reservas.add(fechaNueva);
        this.personasQuehicieronReservas.add(personaNueva);
    }

    public void realizarReserva(Persona personaAAgregar, Fecha_Reserva fechaAAgregar){
        if(horarioEstaDisponible(fechaAAgregar.getFecha(), fechaAAgregar.getBloque())){
            guardarReserva(personaAAgregar, fechaAAgregar);
        } else{
            int prioridadDeLaOtraPersona = PrioridadDeLaPersonaSegunHorario(fechaAAgregar.getFecha(), fechaAAgregar.getBloque());
            int prioridadPersonaAgregar = personaAAgregar.getPrioridad();
            if(prioridadPersonaAgregar > prioridadDeLaOtraPersona) guardarReserva(personaAAgregar, fechaAAgregar);
            else System.out.println("No se puede realizar la reserva, otra persona ya ocupo el horario");
        }
    }

}
