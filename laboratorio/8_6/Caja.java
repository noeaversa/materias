public class Caja extends Persona{
    private int numeroCaja;
    private Persona personaQueAtiende;
    private boolean esAutomatica;

    public Caja(int numeroCaja, Persona personaQueAtiende, boolean esAutomatica) {
        super();
        this.numeroCaja = numeroCaja;
        this.personaQueAtiende = personaQueAtiende;
        this.esAutomatica = esAutomatica;
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public void setNumeroCaja(int numeroCaja) {
        this.numeroCaja = numeroCaja;
    }

    public Persona getPersonaQueAtiende() {
        return personaQueAtiende;
    }

    public void setPersonaQueAtiende(Persona personaQueAtiende) {
        this.personaQueAtiende = personaQueAtiende;
    }

    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }
}
