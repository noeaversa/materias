import java.util.ArrayList;
import java.util.HashSet;

public class Veterinaria {
    private HashSet<Perro> perros;
    private HashSet<Gato> gatos;
    private HashSet<Tortuga> tortugas;

    public Veterinaria(){
        this.perros = new HashSet<>();
        this.gatos = new HashSet<>();
        this.tortugas = new HashSet<>();
    }

    public ArrayList<String> razasQueNoCumplieronAsistencia(){
        ArrayList<String> razas = new ArrayList<>();
        for(Perro perroAuxiliar : this.perros){
            String raza = perroAuxiliar.razaQueNoCumplioLaAsistencia();
            if(raza != null) razas.add(raza);
        }
        return razas;
    }

    public int cantidadDePerrosConPerfectaAsistencia(){
        int contadorAsistencia = 0;
        for(Perro auxiliar : this.perros){
            if(auxiliar.CumplioLasAsistenciasAnuales()) contadorAsistencia++;
        }
        return contadorAsistencia;
    }

    public int cantidadGatosConPerfectaAsistencia(){
        int contadorAsistencia = 0;
        for(Gato gatoAuxiliar : this.gatos){
            if(gatoAuxiliar.CumplioLasAsistenciasAnuales()) contadorAsistencia++;
        }
        return contadorAsistencia;
    }

    public int cantidadTortugasCOnAsistenciaPerfecta(){
        int contadorAsistencia = 0;
        for(Tortuga tortugaAuxiliar : this.tortugas){
            if(tortugaAuxiliar.CumplioLasAsistenciasAnuales()) contadorAsistencia++;
        }
        return contadorAsistencia;
    }

    public String mascotaConMayorAsistencia(){
        int cantidadPerros = cantidadDePerrosConPerfectaAsistencia();
        int cantidadGatos = cantidadGatosConPerfectaAsistencia();
        int cantidadTortugas = cantidadTortugasCOnAsistenciaPerfecta();

        if(cantidadPerros > cantidadGatos && cantidadPerros > cantidadTortugas) return "Perro";
        else if(cantidadGatos > cantidadPerros && cantidadGatos > cantidadTortugas) return "Gato";
        else if(cantidadTortugas > cantidadGatos && cantidadPerros < cantidadTortugas) return "tortuga";
        else return "Hay mascotas con misma cantidad de asistencias perfectas";
    }
}
