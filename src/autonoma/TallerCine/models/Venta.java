
package autonoma.TallerCine.models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

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
    String detalle = "";
    for (Boleta b : boletas) {
        detalle += "Pelicula: " + b.pelicula + " - Costo: " + b.getCostoFinal() + "\n";
    }

    // Generar un número aleatorio entre 1000 y 9999
    Random rand = new Random();
    int numeroAleatorio = rand.nextInt(9000) + 1000; // Rango [1000, 9999]
    String numeroFactura = "F-" + numeroAleatorio;

    return new Factura(numeroFactura, detalle);
}
}