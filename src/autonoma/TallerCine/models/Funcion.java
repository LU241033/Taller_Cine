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
 * Clase abstracta que representa una función de cine (hora).
 * Cada función tiene un tipo y un porcentaje de descuento.
 */
public abstract class Funcion {
    protected String tipo;
    protected double porcentajeDescuento;

    /**
     * Devuelve el porcentaje de descuento aplicado por esta función.
     * @return porcentaje de descuento (por ejemplo 0.2 = 20%)
     */
    public abstract double getObtenerDescuento();

    public String getTipo() {
        return tipo;
    }
}
