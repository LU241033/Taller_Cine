
package autonoma.TallerCine.models;

/**
 * @author Gilary
 * @since 20250405
 * @version 1.0
 */

/**
 * Representa una factura generada a partir de una venta.
 */
public class Factura {
    private String numero;
    private String detalle;

    public Factura(String numero, String detalle) {
        this.numero = numero;
        this.detalle = detalle;
    }

    public String getNumero() {
        return numero;
    }

    public String getDetalle() {
        return detalle;
    }
}