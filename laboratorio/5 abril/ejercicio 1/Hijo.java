public class Hijo extends Persona{
    private String escuela;
    private String juegoFav;

    public Hijo(){
        super();
        this.escuela = "LOVERRRR";
        this.juegoFav = "friv";
    }

    public Hijo(String nombre, int edad, int dni, int telefono, String direccion, String Escuela, String juego){
        super(nombre, edad, dni, telefono, direccion);
        this.escuela = Escuela;
        this.juegoFav = juego;
    }
}
