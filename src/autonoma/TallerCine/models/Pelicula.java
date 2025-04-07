
package autonoma.TallerCine.models;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gilary
 * @since 20250405
 * @version 1.0
 */

/**
 * Representa una película con título, género, duración, costo base y funciones asociadas.
 */
public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;
    private double costoBase;
    private List<Funcion> funciones;
    
    /**
     * Crea una nueva película con sus datos básicos.
     * 
     * @param titulo     Título de la película.
     * @param genero     Género de la película.
     * @param duracion   Duración en minutos.
     * @param costoBase  Costo base de una boleta para esta película.
     */

    public Pelicula(String titulo, String genero, int duracion, double costoBase) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.costoBase = costoBase;
        this.funciones = new ArrayList<>();
    }

    /**
     * Devuelve el costo base de la película.
     * @return costo base
     */
    public double obtenerCostoBase() {
        return costoBase;
    }

    /**
     * Agrega una función a la lista de funciones disponibles para la película.
     * @param funcion Función a agregar.
     */
    public void agregarFuncion(Funcion funcion) {
        funciones.add(funcion);
    }
}

