public class Cliente extends Persona{
    private int cbu;
    private int DineroCliente;
    private String satisfaccion;

    public String getSatisfaccion() {
        return satisfaccion;
    }

    public void setSatisfaccion(String satisfaccion) {
        this.satisfaccion = satisfaccion;
    }

    public Cliente(int cbu, String nombre, int dni) {
        super(nombre, dni);
        this.cbu = cbu;
        this.DineroCliente = 100;
    }

    public int getDineroCliente() {
        return DineroCliente;
    }
    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public void setDineroCliente(int dineroCliente) {
        DineroCliente = dineroCliente;
    }
}
