import java.util.ArrayList;

public class Calculadora {
    private ArrayList<Integer> pila;
    private ArrayList<Integer> memoria;

    public Calculadora(){
        this.pila = new ArrayList<>();
        this.memoria = new ArrayList<>();
    }

    public void push(int numeroAIngresar){
        this.pila.add(numeroAIngresar);
    }

    public boolean estaVacio(){
        if(this.pila.size() == 0) return true;
        return false;
    }
    public void eliminarElementos(){
        this.pila.remove(0);
        this.pila.remove(1);
    }
    public void agregarElementoPila(int elemento){
        this.pila.add(elemento);
    }

    public void agregarElementoMemoria(int elemento){
        this.memoria.add(elemento);
    }

    public void add(int elemento){
        if(estaVacio()) {
            agregarElementoPila(0);
        } else{
            int suma = this.pila.get(0) + this.pila.get(1);
            eliminarElementos();
            agregarElementoPila(suma);
            agregarElementoPila(elemento);
        }
    }

    public void sub(int elemento){
        if (estaVacio()) agregarElementoPila(0);
        else{
            int resta = this.pila.get(0) - this.pila.get(1);
            eliminarElementos();
            agregarElementoPila(resta);
            agregarElementoPila(elemento);
        }
    }

    public void mul(int elemento){
        if (estaVacio()) agregarElementoPila(0);
        else{
            int multiplicacion = this.pila.get(0) * this.pila.get(1);
            eliminarElementos();
            agregarElementoPila(multiplicacion);
            agregarElementoPila(elemento);
        }
    }

    public void write(int elementoNuevo){
        if (estaVacio()) agregarElementoMemoria(0);
        else{
            int elemento = this.pila.get(0);
            this.pila.remove(0);
            agregarElementoPila(elementoNuevo);
            agregarElementoMemoria(elemento);
        }
    }

    public void read(int variable){
        agregarElementoPila(variable);
    }



}
