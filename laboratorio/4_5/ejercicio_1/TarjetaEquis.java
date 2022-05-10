import java.util.ArrayList;

public class TarjetaEquis {
    private float saldo;
    private float saldoMinimo;
    private float numeroId;
    ArrayList<Viaje> viajes;

    public TarjetaEquis(int id){
        numeroId = id;
        viajes = new ArrayList<>();
    }
    public TarjetaEquis(){
        viajes = new ArrayList<>();
    }

    public void cargarSube(float monto){
        this.saldo += monto;
    }

    public void realizarViaje(Viaje viaje){
        this.viajes.add(viaje);
    }

    public float ultimoMontoAbonado(){
        Viaje ultimoViaje = this.viajes.get(this.viajes.size() - 1);
        return ultimoViaje.getPrecio();
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(float saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    public boolean seSuperaElSaldoNegativo(){
        if(this.getSaldo() < this.getSaldoMinimo()) return true;
        else return false;
    }

    public float getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
}
