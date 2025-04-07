
package autonoma.TallerCine.models;

/**
 *
 * @author Luisa Fernanda Henao Posada
 * @since 20250405
 * @version 1.0.0
 */

/**
 * Representa un usuario tipo Mayor (tercera edad).
 * Tiene un descuento fijo de 1000.
 */
public class AdultoMayor extends Usuario {
    public AdultoMayor(String nombre) {
        super(nombre);
    }

    @Override
    public double getDescuento() {
        return 1000;
    }
}
