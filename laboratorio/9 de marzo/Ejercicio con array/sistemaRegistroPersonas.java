
import java.util.ArrayList;

public class sistemaRegistroPersonas {
    private ArrayList<Persona> personas;

    public void agregarPersona(Persona p){
        this.personas.add(p);
    }
    public sistemaRegistroPersonas(){
        this.personas = new ArrayList<>();
    }

    public Persona getPosition(int i){
        return personas.get(i);
    }

    public int getSize(){
        return personas.size();
    }

    public void Remove(int i){
        personas.remove(i);
    }

}
