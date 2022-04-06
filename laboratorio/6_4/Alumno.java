public class Alumno extends Persona{
    private String curso;
    private int nroLegajo;
    private String orientacion;

    public Alumno(){
        super();
        this.nroLegajo = 1892;
        this.curso = "5°C";
        this.orientacion = "Computacion, no soy bobi";
    }

    public Alumno(String nombrePersona, int edad, int dni, int telefono, String direccion, String curso, int nroLegajo, String orientacion){
        super(nombrePersona, edad, dni, telefono, direccion);
        this.curso = curso;
        this.nroLegajo = nroLegajo;
        this.orientacion = orientacion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
}
