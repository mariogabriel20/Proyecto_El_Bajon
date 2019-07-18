
package practica_proyecto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author migfe
 */
public class Ventas1 {
    
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    
    private int idVenta;
    private String idUsuario;
    private Date date;
    private int metodoPago;
    private int valorTotal;
    private int folio;

    public Ventas1() {
    }

    public SimpleDateFormat getFormat() {
        return format;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(int metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

   

    
    
    
    
    
}
