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
 * Función de tipo "Tarde", con 10% de descuento.
 */
public class FuncionTarde extends Funcion {
    public FuncionTarde() {
        this.tipo = "Tarde";
        this.porcentajeDescuento = 0.1;
    }

    @Override
    public double getObtenerDescuento() {
        return porcentajeDescuento;
    }
}
