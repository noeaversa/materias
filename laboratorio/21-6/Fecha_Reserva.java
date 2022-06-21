import java.time.LocalDate;

public class Fecha_Reserva {
    private int bloque;
    private LocalDate fecha;
    private Persona personaQueRealizoLaReserva;

    public Fecha_Reserva(){
        this.fecha = LocalDate.now();
        this.bloque = 6;
    }
    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Persona getPersonaQueRealizoLaReserva() {
        return personaQueRealizoLaReserva;
    }

    public void setPersonaQueRealizoLaReserva(Persona personaQueRealizoLaReserva) {
        this.personaQueRealizoLaReserva = personaQueRealizoLaReserva;
    }
}
