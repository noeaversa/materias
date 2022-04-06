import java.util.ArrayList;

public class Madre extends Persona{
    private String nombreEmpresa;
    private ArrayList<Hijo> hijos = new ArrayList();

    public Madre(ArrayList<Hijo> hijos1){
        super();
        this.nombreEmpresa = "Telecentro :(";
        this.hijos = hijos1;
    }

    public Madre(String nombre, int edad, int dni, int telefono, String direccion, String empresa, ArrayList<Hijo> hijos1){
        super(nombre, edad, dni, telefono, direccion);
        this.nombreEmpresa = empresa;
        this.hijos = hijos1;
    }

    public ArrayList<Hijo> hijosMenores(){
        ArrayList<Hijo> menores = new ArrayList();
        for(Hijo hijoActual: this.hijos){
            if(hijoActual.getEdad() < 18) menores.add(hijoActual);
        }
        return menores;
    }
}
