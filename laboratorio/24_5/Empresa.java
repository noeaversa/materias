import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleados> empleadosArray;
    private String nombreEmpresa;
    private ArrayList<Integer> cantidadDeTrabajadoresMinima;

    public Empresa(){
        this.empleadosArray = new ArrayList<>();
        this.nombreEmpresa = "Bufe&Bufe Co.";
        this.cantidadDeTrabajadoresMinima = new ArrayList<>();
    }

    public ArrayList<Integer> porcentajeAsistenciaEmpleados(int mes){
        ArrayList<Integer> porcentajes = new ArrayList<>();
        for(Empleados i : this.empleadosArray){
            int porcentaje_X_Empleado = i.porcentajeAsistencia(mes);
            porcentajes.add(porcentaje_X_Empleado);
        }
        return porcentajes;
    }

    public int cantidadDeEmpleadosActuales(){ // se tomo empleados Actuales a los empleados que trabajan el dia de hoy
        int cantidad = 0;
        String diaHoy = "Martes";
        for(Empleados empleadoAux : this.empleadosArray){
            ArrayList<String> dias = empleadoAux.getDiasLaboralesNombre();
            for (String dia : dias){
                if(dia.equals(diaHoy)) cantidad++;
            }
        }
        return cantidad;
    }

    public void imprimirDatos (Empleados empleado){
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellido());
        System.out.println(empleado.getTelefono());
    }


    public void asistenciaPerfecta(int mes){

        for(Empleados empleadoAux: this.empleadosArray) {
            if (empleadoAux.porcentajeAsistencia(mes) == 100) {
                imprimirDatos(empleadoAux);
            }
        }
    }

    public void asistencia50(int mes){

        for(Empleados empleadoAux: this.empleadosArray) {
            if (empleadoAux.porcentajeAsistencia(mes) <= 50) {
                imprimirDatos(empleadoAux);
            }
        }
    }

    public void llegadaTarde(int mes){
        for(Empleados empleadoAux: empleadosArray) {
            int diferencia = empleadoAux.getIngresos().get(empleadoAux.getIngresos().size()-1).getMinute() - empleadoAux.getHorarioLaboral().getMinute();
            if (diferencia >= 5) {
                imprimirDatos(empleadoAux);
            }
        }
    }

    public ArrayList<Empleados> getEmpleadosArray() {
        return empleadosArray;
    }

    public void setEmpleadosArray(ArrayList<Empleados> empleadosArray) {
        this.empleadosArray = empleadosArray;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Integer> getCantidadDeTrabajadoresMinima() {
        return cantidadDeTrabajadoresMinima;
    }

    public void setCantidadDeTrabajadoresMinima(ArrayList<Integer> cantidadDeTrabajadoresMinima) {
        this.cantidadDeTrabajadoresMinima = cantidadDeTrabajadoresMinima;
    }

    public void tablaSemanalDeTrabajadores(){
        int contador = 0;
        System.out.println("Lunes: " + getCantidadDeTrabajadoresMinima().get(contador));
        System.out.println("Martes: " + getCantidadDeTrabajadoresMinima().get(contador++));
        System.out.println("Miercoles: " + getCantidadDeTrabajadoresMinima().get(contador++));
        System.out.println("Jueves: " + getCantidadDeTrabajadoresMinima().get(contador++));
        System.out.println("Viernes: " + getCantidadDeTrabajadoresMinima().get(contador++));
    }


}
