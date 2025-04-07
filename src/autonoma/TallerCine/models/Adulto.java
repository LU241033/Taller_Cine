
package autonoma.TallerCine.models;

/**
 *
 * @author Luisa Fernanda Henao Posada
 * @since 20250405
 * @version 1.0.0
 */

/**
 * Representa un usuario tipo Adulto.
 * No tiene descuento.
 */
public class Adulto extends Usuario {
    public Adulto(String nombre) {
        super(nombre);
    }

    @Override
    public double getDescuento() {
        return 0;
    }
}

