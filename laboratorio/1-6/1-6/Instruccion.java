import java.util.ArrayList;
public class Instruccion{
    private String operacion;
    private Calculadora calculadora;

    public Instruccion(){
        this.operacion = " ";
        this.calculadora = new Calculadora();
    }
    public String getOperacion() {
        return operacion;
    }
    public void push(int numero){
        this.calculadora.getPila().add(numero);
    }

    public boolean esMayorAUno(int i){
        if(i > 1) return true;
        else return false;
    }

    public boolean esIgualAUno(int i){
        if(i == 1) return true;
        return false;
    }

    public void add(){
        if(esMayorAUno(this.calculadora.getPila().size() - 1)){
            int pila1 = this.calculadora.getPila().get(0), pila2 = this.calculadora.getPila().get(1);
            int sumaPilas = pila1 + pila2;
            this.calculadora.getPila().remove(0);
            this.calculadora.getPila().remove(1);
            this.calculadora.getPila().add(sumaPilas);
        }
        else if(!esMayorAUno(this.calculadora.getPila().size() - 1) && !esIgualAUno(this.calculadora.getPila().size() - 1)){
            this.calculadora.getPila().add(0);
        }

    }

    public void sub(){
        if(esMayorAUno(this.calculadora.getPila().size() - 1)){
            int pila1 = this.calculadora.getPila().get(0), pila2 = this.calculadora.getPila().get(1);
            int restaPilas = pila1 - pila2;
           this.calculadora.getPila().remove(0);
           this.calculadora.getPila().remove(1);
           this.calculadora.getPila().add(restaPilas);
       }
        else if(!esMayorAUno(this.calculadora.getPila().size() - 1) && !esIgualAUno(this.calculadora.getPila().size() - 1)){
            this.calculadora.getPila().add(0);
        }
    }

    public void mul(){
        if(esMayorAUno(this.calculadora.getPila().size() - 1)){
            int pila1 = this.calculadora.getPila().get(0), pila2 = this.calculadora.getPila().get(1);
            int mulPilas = pila1 * pila2;
            this.calculadora.getPila().remove(0);
            this.calculadora.getPila().remove(1);
            this.calculadora.getPila().add(mulPilas);
        }
        else if(!esMayorAUno(this.calculadora.getPila().size() - 1) && !esIgualAUno(this.calculadora.getPila().size() - 1)){
            this.calculadora.getPila().add(0);
        }
    }
    public void write(int variable){
        if(esMayorAUno(this.calculadora.getPila().size() - 1)){
            variable = this.calculadora.getPila().get(0);
            this.calculadora.getPila().remove(0);
        }
        else if(!esMayorAUno(this.calculadora.getPila().size() - 1) && !esIgualAUno(this.calculadora.getPila().size() - 1)){
            variable = 0;
        }
    }

    public void read(int variable){
        if(variable <= 0) {
            variable = 0;
        }
        this.calculadora.getPila().remove(variable);
    }
}

