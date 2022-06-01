import java.util.ArrayList;

public class Calculadora {
    private Programa programa;
    private ArrayList<Integer> pila;

    public Calculadora(){
        this.programa = new Programa();
        this.pila = new ArrayList<>();
    }

    public ArrayList<Integer> getPila() {
        return pila;
    }

    public void ejecutarTodo(){
        for(Rutina i: this.programa.getRutinas()){
            int variable = 0;
            ArrayList<Instruccion> instrucciones = i.getInstrucciones();
            for(Instruccion j: instrucciones){
                if(j.getOperacion().equals("push")) j.push(1);
                else if(j.getOperacion().equals("add")) j.add();
                else if(j.getOperacion().equals("sub")) j.sub();
                else if(j.getOperacion().equals("mul")) j.mul();
                else if(j.getOperacion().equals("write")) j.write(variable);
            }
        }
    }

    public void Ejecutar(Rutina rutina){
        int variable = 0;
        ArrayList<Instruccion> instrucciones = rutina.getInstrucciones();
        for(Instruccion j: instrucciones){
            if(j.getOperacion().equals("push")) j.push(1);
            else if(j.getOperacion().equals("add")) j.add();
            else if(j.getOperacion().equals("sub")) j.sub();
            else if(j.getOperacion().equals("mul")) j.mul();
            else if(j.getOperacion().equals("write")) j.write(variable);
        }
    }

    public void cargarPrograma(Programa programa){
        this.programa = programa;
    }
}
