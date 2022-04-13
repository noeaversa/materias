import java.util.ArrayList;

public class Cantante extends Persona{
    private String nombreArtistico;
    private ArrayList<Cancion> canciones;

    public Cantante(){
        super();
        this.canciones = new ArrayList<>();
        this.nombreArtistico = "Pepe";
    }

    public ArrayList<Cancion> obtenerCancionesLargas(){
        ArrayList<Cancion> cancionesLargas = new ArrayList<>();
        for(Cancion cancionAux : this.canciones){
            if(cancionAux.esUnaCancionLarga()){
                cancionesLargas.add(cancionAux);
            }
        }
        return cancionesLargas;
    }

    public void AgregarCancion(String nombreCancion, int duracionSegs){
        Cancion cancionNueva = new Cancion(nombreCancion, duracionSegs);
        this.canciones.add(cancionNueva);
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
}
