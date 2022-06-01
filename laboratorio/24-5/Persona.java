import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int telefono;
    private LocalDate fechaNacimiento;

    public Persona(){
        this.nombre = " ";
        this.apellido = "";
        this.telefono = 1211212;
        this.fechaNacimiento.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
