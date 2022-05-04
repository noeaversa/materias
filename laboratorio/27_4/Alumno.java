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

    public ArrayList<Float> retornarClaveNotas(String nombre){
        ArrayList<Float> arrayListADelvolver = new ArrayList<>();
        arrayListADelvolver = this.notasPorMateria.get(nombre);
        return arrayListADelvolver;
    }

    public void AgregarNota(String nombreMateria, float notaNueva) {
        ArrayList<Float> notasTotales = devolverArray(nombreMateria);
        notasTotales.add(notaNueva);
        this.notasPorMateria.put(nombreMateria, notasTotales);
    }

    public boolean esMenor(float n1, float n2){
        if(n1 < n2) return true; // es menor
        else return false; // es mayor
    }

    public float menorNota(String NombreMateria){
        ArrayList<Float> notasTotales = devolverArray(NombreMateria);
        float menorNota = 11;
        for(Float i : notasTotales){
            if(esMayorOmenor(i, menorNota)) menorNota = i;
        }
        return menorNota;
    }

    public Float mayorNota(String nombreMateria){
        ArrayList<Float> notaasTotales = devolverArray(nombreMateria);
        float mayorNota = 0;
        for(float i: notaasTotales){
            if(!esMayorOmenor(i, mayorNota)) mayorNota = i;
        }
        return mayorNota;
    }

    public Float promedioNotas(String nombreMateria){
        ArrayList<Float> notasTotales = devolverArray(nombreMateria);
        float promedio = 0;

        for(float i: notasTotales){
            promedio = (promedio + i) / 2;
        }
        return promedio;
    }

    public ArrayList<Float> menu(String respuesta){
        ArrayList<Float> notas = new ArrayList<>();
        while(!respuesta.equals("s")){
            System.out.println("ingrese una nota:");
            Scanner ingresoNotas = new Scanner(System.in);
            float nota = ingresoNotas.nextFloat();
            notas.add(nota);

            System.out.println("desea ingresar notas? (s/n)");
            Scanner ingresoOpciones = new Scanner(System.in);
            respuesta = ingresoOpciones.nextLine();
        }
        return notas;
    }

    public void agregarMateria(String nombreDeMateria){
        String respuesta = "s";
        ArrayList<Float> notasNuevas = menu(respuesta);
        this.notasPorMateria.put(nombreDeMateria, notasNuevas);
    }
}
