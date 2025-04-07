
package autonoma.TallerCine.models;

/**
 *
 * @author Luisa Fernanda Henao Posada
 * @since 20250405
 * @version 1.0.0
 */

/**
 * Clase abstracta que representa a un usuario del cine.
 * Tiene un nombre y un método abstracto para obtener el descuento.
 */
public abstract class Usuario {
    String nombre;

    /**
     * Constructor del usuario.
     * @param nombre Nombre del usuario.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método abstracto para obtener el descuento que aplica el usuario.
     * @return Valor del descuento.
     */
    public abstract double getDescuento();

    public String getNombre() {
        return nombre;
    }
}
