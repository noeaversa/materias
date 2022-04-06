import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido{
    private LocalDate fechaCreacion;
    private Plato plato;
    private Persona persona;
    private LocalTime horaEntrega;
    private boolean estadoPedido;

    public Pedido(){
        this.fechaCreacion =  LocalDate.now();
        this.plato = new Plato();
        this.persona = new Persona();
        this.horaEntrega = LocalTime.now();
        this.estadoPedido = false;

    }
    public Pedido(LocalDate fechaCreacion, Plato plato, Persona persona, LocalTime horaEntrega, boolean estadoPedido) {
        this.fechaCreacion = fechaCreacion;
        this.plato = plato;
        this.persona = persona;
        this.horaEntrega = horaEntrega;
        this.estadoPedido = estadoPedido;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(boolean estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}
