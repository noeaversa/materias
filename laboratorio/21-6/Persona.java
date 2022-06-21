public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int prioridad; // si es Alumno es 0, sino va de 1 a 10

    public Persona(){
        this.nombre = "Titu";
        this.apellido = "Gonzalez";
        this.dni = 23232;
        this.prioridad = 10;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
