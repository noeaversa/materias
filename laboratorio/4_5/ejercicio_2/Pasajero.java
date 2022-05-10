public class Pasajero {
    private String nombre;
    private String apellido;
    private TarjetaEquis tarjeta;

    public Pasajero(){
        tarjeta = new TarjetaEquis();
    }

    @Override
    public String toString(){
        String stringADevolver = "Nombre: " + this.getNombre() + "/n Apellido: " + this.getApellido() + "/n Viajes realizados: " + this.getTarjeta().toString();
        return stringADevolver;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TarjetaEquis getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaEquis tarjeta) {
        this.tarjeta = tarjeta;
    }
}
