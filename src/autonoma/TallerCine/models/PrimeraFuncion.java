/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.TallerCine.models;

/**
 *
 * @author Alejandra
 * @since 20250405
 * @version 1.0
 */
/**
 * Función de tipo "Primera función", con 20% de descuento.
 */
public class PrimeraFuncion extends Funcion {
    public PrimeraFuncion() {
        this.tipo = "Primera";
        this.porcentajeDescuento = 0.2;
    }

    @Override
    public double getObtenerDescuento() {
        return porcentajeDescuento;
    }
}