public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona(){
        this.nombre = "Pepito";
        this.edad = 15;
        this.dni = 12345678;
        this.telefono = 1112345678;
        this.direccion = "Av. Constituyentes 123";
    }

    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = 0;
        this.dni = 0;
        this.telefono = 0;
        this.direccion = " ";
    }

    public Persona(String nombre, int edad, int dni, int telefono, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getDni(){
        return this.dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }

    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public String getDireccion(){
        return this.direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public boolean esMayorDeEdad(){
        return this.edad > 17;
    }

    public boolean tienenLaMismaEdad(Persona p){
        return this.edad == p.getEdad();
    }

    public boolean esUnAdultoJoven(){
        if(this.edad >= 18 && this.edad <= 35) return true;
        else return false;
    }
}
