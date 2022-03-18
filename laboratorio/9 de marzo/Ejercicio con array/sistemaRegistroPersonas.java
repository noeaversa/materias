
import com.company.Persona;

import java.util.ArrayList;

public class sistemaRegistroPersonas {
    //private ArrayList<Character> ABM = new ArrayList<>();
    private ArrayList<Persona> personas = new ArrayList<>();

    public sistemaRegistroPersonas(Persona p){
        personas.add(p);
    }
    public sistemaRegistroPersonas(){
        Persona p = new Persona(" ");
        personas.add(p);
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
