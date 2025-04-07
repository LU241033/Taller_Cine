package autonoma.TallerCine.main;

import autonoma.TallerCine.Exception.PrecioInvalidoException;
import autonoma.TallerCine.models.Adulto;
import autonoma.TallerCine.models.AdultoMayor;
import autonoma.TallerCine.models.Boleta;
import autonoma.TallerCine.models.Cine;
import autonoma.TallerCine.models.Factura;
import autonoma.TallerCine.models.Funcion;
import autonoma.TallerCine.models.Niño;
import autonoma.TallerCine.models.Pelicula;
import autonoma.TallerCine.models.PrimeraFuncion;
import autonoma.TallerCine.models.Usuario;
import autonoma.TallerCine.models.Venta;
import java.util.Date;

/**
 * Clase principal que ejecuta el sistema de venta de boletas para un cine.
 * 
 * Esta clase crea un cine, películas, funciones y usuarios. Simula ventas de boletas
 * y genera una factura final con el detalle y total de la venta. Además, controla
 * posibles excepciones si el precio final de una boleta resulta inválido.
 * 
 * @author Luisa Fernanda Henao Posada
 * @since 20250405
 * @version 1.0.0
 * 
 */
public class Main {

    /**
     * Método principal del sistema.
     * 
     * Ejecuta la lógica de prueba creando un cine con una película y varios usuarios.
     * Luego simula la compra de boletas aplicando descuentos, genera una factura
     * y muestra el resultado. También maneja la excepción personalizada si se detecta
     * un precio final inválido (menor a 0).
     * 
     * @param args los argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear cine
        Cine cine = new Cine("Cine Star", "Av. Principal #123");

        // Crear película con función
        Pelicula pelicula = new Pelicula("Matrix", "Ciencia Ficción", 130, 3000);
        Funcion funcion = new PrimeraFuncion(); // Descuento del 20%
        pelicula.agregarFuncion(funcion);
        cine.agregarPelicula(pelicula);

        // Crear usuarios con distintos tipos de descuentos
        Usuario niño = new Niño("Luisito");                // Descuento: $500
        Usuario adultoMayor = new AdultoMayor("Don Pepe"); // Descuento: $1000
        Usuario adulto = new Adulto("Andrea");              // Descuento: $0

        // Registrar usuarios en el cine
        cine.registrarUsuario(niño);
        cine.registrarUsuario(adultoMayor);
        cine.registrarUsuario(adulto);

        // Crear una nueva venta
        Venta venta = new Venta(new Date());

        try {
            // Crear boleta para niño
            Boleta b1 = new Boleta(pelicula, funcion, niño);      // Total: 1900
            venta.agregarBoleta(b1);

            // Crear boleta para adulto
            Boleta b2 = new Boleta(pelicula, funcion, adulto);    // Total: 2400
            venta.agregarBoleta(b2);

            // Crear boleta para adulto mayor
            Boleta b3 = new Boleta(pelicula, funcion, adultoMayor); // Total: 1400
            venta.agregarBoleta(b3);

            // Crear película de bajo costo para forzar error
            Pelicula barata = new Pelicula("Corto Animado", "Infantil", 10, 1200);
            barata.agregarFuncion(funcion);
            cine.agregarPelicula(barata);

            // Esta boleta debe lanzar excepción por costo final negativo
            Boleta b4 = new Boleta(barata, funcion, adultoMayor); 
            venta.agregarBoleta(b4);

        } catch (PrecioInvalidoException e) {
            // Manejo de error si una boleta tiene un precio inválido
            System.out.println(" Error al generar una boleta: " + e.getMessage());
        }

        // Calcular el total de la venta y generar factura
        double totalVenta = venta.calcularTotal();
        Factura factura = venta.generarFactura();

        // Mostrar el resumen en consola
        System.out.println("Total Venta: $" + totalVenta);
        System.out.println("Factura #" + factura.getNumero());
        System.out.println("Detalle:\n" + factura.getDetalle());
    }
}
