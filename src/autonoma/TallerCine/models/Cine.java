package autonoma.TallerCine.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un cine que administra películas, usuarios y ventas de boletas.
 * 
 * Esta clase permite registrar películas disponibles, usuarios (clientes), y 
 * almacenar las ventas realizadas. Sirve como clase principal para centralizar 
 * la lógica de negocio del cine.
 * 

 * @author Luisa Fernanda Henao Posada
 * @since 20250405
 * @version 1.0.0
 */
public class Cine {
    /** Nombre del cine */
    private final String nombre;

    /** Dirección física del cine */
    private final String direccion;

    /** Lista de películas que se proyectan en el cine */
    private final List<Pelicula> peliculas;

    /** Lista de usuarios registrados en el cine */
    private final List<Usuario> usuarios;

    /** Lista de ventas realizadas por el cine */
    private final List<Venta> ventas;

    /**
     * Constructor que inicializa un nuevo cine con su nombre y dirección.
     *
     * @param nombre     El nombre del cine.
     * @param direccion  La dirección del cine.
     */
    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.peliculas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    /**
     * Agrega una nueva película a la cartelera del cine.
     *
     * @param pelicula La película que se desea agregar.
     */
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    /**
     * Registra un nuevo usuario (cliente) en el sistema del cine.
     *
     * @param usuario El usuario a registrar.
     */
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    /**
     * Registra una venta de boletas realizada en el cine.
     *
     * @param venta La venta a registrar.
     */
    public void realizarVenta(Venta venta) {
        ventas.add(venta);
    }
}
