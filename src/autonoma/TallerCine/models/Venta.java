
package autonoma.TallerCine.models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Gilary
 * @since 20250405
 * @version 1.0
 */

/**
 * Representa una venta realizada en el cine, que puede incluir múltiples boletas.
 */
public class Venta {
    private Date fecha;
    private double total;
    private List<Boleta> boletas;

    public Venta(Date fecha) {
        this.fecha = fecha;
        this.boletas = new ArrayList<>();
    }

    /**
     * Agrega una boleta a la venta.
     * @param boleta Boleta que se va a agregar.
     */
    public void agregarBoleta(Boleta boleta) {
        boletas.add(boleta);
    }

    /**
     * Calcula el total de la venta sumando el costo final de todas las boletas.
     * @return total de la venta
     */
    public double calcularTotal() {
        total = 0;
        for (Boleta b : boletas) {
            total += b.getCostoFinal();
        }
        return total;
    }

    /**
     * Genera una factura con los detalles de la venta.
     * @return Factura generada.
     */
    public Factura generarFactura() {
        StringBuilder detalle = new StringBuilder();
        for (Boleta b : boletas) {
            detalle.append("Pelicula: ").append(b.pelicula).append(" - Costo: ").append(b.getCostoFinal()).append("\n");
        }
        return new Factura("F-" + System.currentTimeMillis(), detalle.toString());
    }
}