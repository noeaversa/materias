public class Main {

    public static void main(String[] args) {
	Persona p1 = new Persona();
        Persona p2 =new Persona("Lucas");
        Persona p3= new Persona("Mila", 12, 23414141, 11717171, "Bazurco 33");

        int edadP1 = p1.getEdad();
        p1.setEdad(edadP1 * 2);

        p2.setTelefono(1112345678);

        System.out.println("{ " + p3.getNombre() + ", " + p3.getEdad() + ", " + p3.getDni() + ", "+ p3.getTelefono() + ", " +  p3.getDireccion()+ " }");
    }
}
