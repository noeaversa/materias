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
        for(Empleados i : this.empleadosArray){
            ArrayList<String> dias = i.getDiasLaboralesNombre();
            for (String j : dias){
                if(dias.equals(diaHoy)) cantidad++;
            }
        }
        return cantidad;
    }

    public void imprimirDatos (Empleados i){
        System.out.println(i.getNombre());
        System.out.println(i.getApellido());
        System.out.println(i.getTelefono());
    }


    public void asistenciaPerfecta(int mes){

        for(Empleados i: empleadosArray) {
            if (i.porcentajeAsistencia(mes) == 100) {
                imprimirDatos(i);
            }
        }
    }

    public void asistencia50(int mes){

        for(Empleados i: empleadosArray) {
            if (i.porcentajeAsistencia(mes) <= 50) {
                imprimirDatos(i);
            }
        }
    }

    public void llegadaTarde(int mes){
        for(Empleados i: empleadosArray) {
            int diferencia = i.getIngresos().get(i.getIngresos().size()-1).getMinute() - i.getHorarioLaboral().getMinute();
            if (diferencia >= 5) {
                imprimirDatos(i);
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
        System.out.println("Lunes: " + getCantidadDeTrabajadoresMinima().get(0));
        System.out.println("Martes: " + getCantidadDeTrabajadoresMinima().get(1));
        System.out.println("Miercoles: " + getCantidadDeTrabajadoresMinima().get(2));
        System.out.println("Jueves: " + getCantidadDeTrabajadoresMinima().get(3));
        System.out.println("Viernes: " + getCantidadDeTrabajadoresMinima().get(4));

    }


}
