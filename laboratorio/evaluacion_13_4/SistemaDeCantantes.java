import java.util.ArrayList;

public class SistemaDeCantantes {
    private ArrayList<Cantante> cantantes;

    public SistemaDeCantantes(){
        this.cantantes = new ArrayList<>();
    }

    public ArrayList<Cantante> obtenerCantantesJovenes(){
        ArrayList<Cantante> cantantesJovenes = new ArrayList<>();
        for(Cantante cantanteAux : this.cantantes){
            if(cantanteAux.esUnAdultoJoven()){
                cantantesJovenes.add(cantanteAux);
            }
        }
        return cantantesJovenes;
    }

    public void agregarCancion(String NombreArtistico, String nombreCancion, int duracionSegs){
        for(Cantante cantante : this.cantantes){
            if(cantante.getNombreArtistico() == NombreArtistico){
                Cancion nuevaCancion = new Cancion(nombreCancion, duracionSegs);
                ArrayList<Cancion> cancionArray = cantante.getCanciones();
                cancionArray.add(nuevaCancion);
                cantante.setCanciones(cancionArray);
            }
        }
    }

    public static void main(String[] args) {
        Cantante cantanteQuintoPunto = new Cantante();
        cantanteQuintoPunto.setNombreArtistico("Ozuna");
        System.out.println("Nombre Artistico nuevo: " + cantanteQuintoPunto.getNombreArtistico());
    }
}
