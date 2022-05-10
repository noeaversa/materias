import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private ArrayList<Pasajero> pasajerosPresentes;
    private ArrayList<Pasajero> historialPasajeros;
    private int linea;

    public Sistema(){
        pasajerosPresentes = new ArrayList<>();
        historialPasajeros = new ArrayList<>();
    }
    public boolean seSubioAlTransporteAntes(Pasajero pasajero){
        for (Pasajero pasajeroAuxiliar : this.historialPasajeros) {
            if(pasajeroAuxiliar.equals(pasajero)) return true;
        }
        return false;
    }
    public void subePasajero(Pasajero pasajero){
        float saldoMinimo = pasajero.getTarjeta().getSaldoMinimo();
        float saldoTotal = pasajero.getTarjeta().getSaldo();
        if(saldoTotal >= saldoMinimo) {
            System.out.println("Bienvenido!");
            this.pasajerosPresentes.add(pasajero);
            if(!seSubioAlTransporteAntes(pasajero)) this.historialPasajeros.add(pasajero);
        }
        else System.out.println("saldo insuficiente");
    }

    public void seBajaPasajero(Pasajero pasajero){
        this.pasajerosPresentes.remove(pasajero);
    }

    public HashSet<Pasajero> pasajerosQueSeHanSubidoAlgunaVez(){
        HashSet<Pasajero> historialDePasajeros = new HashSet<>();
        for (Pasajero pasajeroAux : this.historialPasajeros) {
            if(seSubioAlTransporteAntes(pasajeroAux)) historialDePasajeros.add(pasajeroAux);
        }
        return historialDePasajeros;
    }

    public HashMap<Pasajero, Float> pasajerosConUltimoMontoAbonado(){
        HashMap<Pasajero, Float> pasajeros = new HashMap<>();
        for(Pasajero pasajeroAux : this.historialPasajeros){
            pasajeros.put(pasajeroAux, pasajeroAux.getTarjeta().ultimoMontoAbonado());
        }
        return pasajeros;
    }

    public float ultimoMontoAbonadoPorPasajero(float numeroId){
        float ultimoMonto = 0f;
        HashMap<Pasajero, Float> pasajeroAAbonar = pasajerosConUltimoMontoAbonado();
        for (Pasajero pasajeroAUX : pasajeroAAbonar.keySet()){
            TarjetaEquis tarjetaAux = pasajeroAUX.getTarjeta();
            if(tarjetaAux.getNumeroId() == numeroId) ultimoMonto = tarjetaAux.ultimoMontoAbonado();
        }
        return ultimoMonto;
    }

}
