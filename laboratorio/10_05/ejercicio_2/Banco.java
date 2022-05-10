import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Banco {
    private String nombre;
    private ArrayList<Cliente> visitantesClientes;

    public Banco(){
        this.nombre = "hola";
        this.visitantesClientes = new ArrayList<>();
    }

    public HashSet<Integer> cbusDeClientesVisitantes(){
        HashSet<Integer> cbuClientes = new HashSet<>();
        for (Cliente aux : this.visitantesClientes){
            cbuClientes.add(aux.getCbu());
        }
        return cbuClientes;
    }

    public void imprimirElementosHashSet(){
        HashSet<Integer> elementos = cbusDeClientesVisitantes();
        for(Integer i : elementos){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }


    public HashMap<Integer, Integer> cantidadDeVisitasPorCliente(){
        HashMap<Integer, Integer> hashMapAEntregar = new HashMap<>();
        for(Cliente aux: this.visitantesClientes){
            hashMapAEntregar.put(aux.getCbu(), apariciones(aux));
        }
        return hashMapAEntregar;
    }

    public void ImprimirHasmap(){
        HashMap<Integer, Integer> hasMapImpreso = cantidadDeVisitasPorCliente();
        for(Integer i : hasMapImpreso.keySet()){
            System.out.println("Clave: " + hasMapImpreso.containsKey(i) + " - valor: " + hasMapImpreso.containsValue(i));
        }
    }
    private Integer apariciones (Cliente cliente){
        Integer apariciones = 0;
        for (Cliente aux: visitantesClientes){
            if(cliente.getCbu() == aux.getCbu()) apariciones += 1;
        }
        return apariciones;
    }
}
