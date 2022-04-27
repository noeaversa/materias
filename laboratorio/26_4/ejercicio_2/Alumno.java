import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Alumno extends Persona{
    private String curso;
    private HashMap<String,ArrayList<Float>> notasPorMateria;

    public Alumno(){
        this.notasPorMateria = new HashMap<>();
        this.curso = "5to C";
    }

    public void AgregarNota(String nombreMateria, float notaNueva) {
        ArrayList<Float> notasTotales = new ArrayList<>();
        notasTotales = this.notasPorMateria.get(nombreMateria);
        notasTotales.add(notaNueva);
        this.notasPorMateria.put(nombreMateria, notasTotales);
    }

    public float menorNota(String NombreMateria){
        ArrayList<Float> notasTotales = new ArrayList<>();
        float menorNota = 11;
        notasTotales = this.notasPorMateria.get(NombreMateria);
        for(Float i : notasTotales){
            if(i < menorNota) menorNota = i;
        }
        return menorNota;
    }

    public Float mayorNota(String nombreMateria){
        ArrayList<Float> notaasTotales = new ArrayList<>();
        float mayorNota = 0;
        notaasTotales = this.notasPorMateria.get(nombreMateria);
        for(float i: notaasTotales){
            if(mayorNota < i) mayorNota = i;
        }
        return mayorNota;
    }

    public Float promedioNotas(String nombreMateria){
        ArrayList<Float> notasTotales = new ArrayList<>();
        float promedio = 0;
        notasTotales = this.notasPorMateria.get(nombreMateria);

        for(float i: notasTotales){
            promedio = (promedio + i) / 2;
        }
        return promedio;
    }

    public void agregarMateria(String nombreDeMateria){
        ArrayList<Float> notasNuevas = new ArrayList<>();
        String respuesta = "s";
        while(!respuesta.equals("s")){
            System.out.println("ingrese una nota:");
            Scanner ingresoNotas = new Scanner(System.in);
            float nota = ingresoNotas.nextFloat();
            notasNuevas.add(nota);

            System.out.println("desea ingresar notas? (s/n)");
            Scanner ingresoOpciones = new Scanner(System.in);
            respuesta = ingresoOpciones.nextLine();
        }
        this.notasPorMateria.put(nombreDeMateria, notasNuevas);
    }
}
