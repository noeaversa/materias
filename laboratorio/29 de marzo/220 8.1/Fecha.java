public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void reiniciar(int d, int m, int a){
        this.dia = 0;
        this.año = 0;
        this.mes = 0;
    }

    public void adelantar(int d, int m, int a){
        this.dia = d;
        this.año = a;
        this.mes = m;
    }
    public int mesDias(int m){
        int d = 0;
        if(m == 4 || m == 6 || m == 9 || m == 11) d = 30;
        else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) d = 31;
        else if(m == 2) d = 29;
        return d;
    }
    public boolean normalizar(){
        int a = this.año;
        int d = this.dia;
        int m = this.mes;
        int mesDia = mesDias(m);
        if(a >= 1){
            if(m >= 1 && m <= 12){
                if(d <= mesDia) return true;
            }
        }
        return false;
    }
}
