import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Vivienda {
    private String direccion;
    private String domicilioOEmpresa;
    private ArrayList<Electricidad> factura;
    private Dueño dueñoAsignado;

    public Vivienda(){
        this.factura = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDomicilioOEmpresa() {
        return domicilioOEmpresa;
    }

    public void setDomicilioOEmpresa(String domicilioOEmpresa) {
        this.domicilioOEmpresa = domicilioOEmpresa;
    }

    public ArrayList<Electricidad> getFactura() {
        return factura;
    }

    public void setFactura(ArrayList<Electricidad> factura) {
        this.factura = factura;
    }

    public Dueño getDueñoAsignado() {
        return dueñoAsignado;
    }

    public void setDueñoAsignado(Dueño dueñoAsignado) {
        this.dueñoAsignado = dueñoAsignado;
    }

    public void cargarFactura(Electricidad electricidadACargar){
        LocalDate mes = electricidadACargar.getMes();
        boolean estaElMes = false;
        for(Electricidad eletricidadAux : this.factura){
            if(eletricidadAux.getMes() == mes) {
                estaElMes = true;
            }
        }
        if(!estaElMes){
            this.factura.add(electricidadACargar);
        }
    }

    public boolean esEmpresa(){
        if(this.domicilioOEmpresa.equals("empresa")) return true;
        else return false;
    }

    public int CuantoPago(LocalDate fechaConsulta) {
        int valorAPagar = 0;
        int mesConsulta = fechaConsulta.getMonthValue();
        for (Electricidad auxiliar : this.factura) {
            if (auxiliar.getMes().getMonthValue() == mesConsulta) {
                int KWz = auxiliar.getKWh();
                if(esEmpresa()) valorAPagar = 3 * KWz;
                else valorAPagar = 2 * KWz;
            }
        }
        return valorAPagar;
    }

    public boolean bajoElConsumo(LocalDate FechaAContralar){
        for (Electricidad auxiliar : this.factura){
            LocalDate fechaAuxiliar = auxiliar.getMes();
            if(fechaAuxiliar.getMonthValue() == FechaAContralar.getMonthValue() && (fechaAuxiliar.getYear() + 1) == FechaAContralar.getYear()){
                int auxiliarPago = (CuantoPago(fechaAuxiliar) * 10) / 100;
                int pagoEsteMes = CuantoPago(FechaAContralar);
                if(pagoEsteMes <= auxiliarPago){
                    return true;
                }
            }
        }
        return false;
    }

    public int descuento(LocalDate Fecha){ //llama del main a la funcion
        int facturaTotal;
        if(bajoElConsumo(Fecha)){
            facturaTotal = (CuantoPago(Fecha) * 5) / 100;
        }else facturaTotal = CuantoPago(Fecha);
        return facturaTotal;
    }
}
