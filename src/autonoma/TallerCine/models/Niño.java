/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.TallerCine.models;

/**
 
 * @author Luisa Fernanda Henao Posada
 * @since 20250704
 * @version 1.0.0
 */

/**
 * Representa un usuario tipo Niño.
 * Tiene un descuento fijo de 500.
 */
public class Niño extends Usuario {
    public Niño(String nombre) {
        super(nombre);
    }

    @Override
    public double getDescuento() {
        return 500;
    }
}

