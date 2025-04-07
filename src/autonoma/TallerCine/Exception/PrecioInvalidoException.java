
package autonoma.TallerCine.Exception;

/**
 * @author Gilary
 * @since 20250405
 * @version 1.0
 */
/**
 * Excepción personalizada que se lanza cuando el precio final de una boleta
 * es menor que $0, lo cual no está permitido según las reglas del sistema.
 */
public class PrecioInvalidoException extends Exception{
        public PrecioInvalidoException(String mensaje) {
        super(mensaje);
    }
    
}
