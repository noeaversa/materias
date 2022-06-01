import java.util.ArrayList;
public class Instruccion{
    private String operacion;
    private Calculadora calculadora;

    public Instruccion(){
        this.operacion = " ";
        this.calculadora = new Calculadora();
    }

    public void push(int numero){
        this.calculadora.getPila().add(numero);
    }

    public void add(){
        if((this.calculadora.getPila().size() - 1) > 1){
            int pila1 = this.calculadora.getPila().get(0), pila2 = this.calculadora.getPila().get(1);
            int sumaPilas = pila1 + pila2;
            this.calculadora.getPila().remove(0);
            this.calculadora.getPila().remove(1);
            this.calculadora.getPila().add(sumaPilas);
        }
        else if(this.calculadora.getPila().size() < 1) this.calculadora.getPila().add(0);

    }

    public void sub(){
       if((this.calculadora.getPila().size() - 1) > 1){
            int pila1 = this.calculadora.getPila().get(0), pila2 = this.calculadora.getPila().get(1);
            int restaPilas = pila1 - pila2;
           this.calculadora.getPila().remove(0);
           this.calculadora.getPila().remove(1);
           this.calculadora.getPila().add(restaPilas);
       }
       else if(this.calculadora.getPila().size() < 1) this.calculadora.getPila().add(0);
    }

    public String getOperacion() {
        return operacion;
    }

    public void mul(){
        if((this.calculadora.getPila().size() - 1) > 1){
            int pila1 = this.calculadora.getPila().get(0), pila2 = this.calculadora.getPila().get(1);
            int mulPilas = pila1 * pila2;
            this.calculadora.getPila().remove(0);
            this.calculadora.getPila().remove(1);
            this.calculadora.getPila().add(mulPilas);
        }
        else if(this.calculadora.getPila().size() < 1) this.calculadora.getPila().add(0);
    }
    public void write(int variable){
        if((this.calculadora.getPila().size() - 1) > 1){
            variable = this.calculadora.getPila().get(0);
            this.calculadora.getPila().remove(0);
        }
        else if(this.calculadora.getPila().size() < 1) variable = 0;
    }

}

