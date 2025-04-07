
package autonoma.TallerCine.models;

import autonoma.TallerCine.Exception.PrecioInvalidoException;

/**
 * Representa una boleta de cine que contiene información sobre la película, función y usuario.
 * Calcula el costo final aplicando descuentos.
 * 
 * @author Gilary
 * @since 20250405
 * @version 1.1
 */
public class Boleta {

    private double costoFinal;
    protected Pelicula pelicula;
    protected Funcion funcion;
    protected Usuario usuario;

    /**
     * Crea una boleta con la película, función y usuario especificados.
     * Calcula el costo final en el momento de la creación.
     * 
     * @param pelicula Película asociada a la boleta.
     * @param funcion  Función en la que se proyectará la película.
     * @param usuario  Usuario que compra la boleta.
     * @throws PrecioInvalidoException Si el precio final calculado es menor que $0.
     */
    public Boleta(Pelicula pelicula, Funcion funcion, Usuario usuario) throws PrecioInvalidoException {
        this.pelicula = pelicula;
        this.funcion = funcion;
        this.usuario = usuario;
        calcularCostoFinal();
    }

    /**
     * Calcula el costo final de la boleta aplicando los descuentos por función y usuario.
     * Lanza una excepción si el costo es menor a $0.
     * 
     * @throws PrecioInvalidoException Si el costo calculado es negativo.
     */
    public void calcularCostoFinal() throws PrecioInvalidoException {
        double base = pelicula.obtenerCostoBase();
        double descUsuario = usuario.getDescuento();
        double descFuncion = base * funcion.getObtenerDescuento();
        double precio = base - descUsuario - descFuncion;

        if (precio < 0) {
            throw new PrecioInvalidoException("El precio final de la boleta no puede ser menor a $0.");
        }

        this.costoFinal = precio;
    }

    /**
     * Retorna el costo final de la boleta.
     * 
     * @return Costo final después de aplicar descuentos.
     */
    public double getCostoFinal() {
        return costoFinal;
    }
}
