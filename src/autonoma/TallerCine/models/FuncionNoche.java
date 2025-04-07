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
 * Función de tipo "Noche", sin descuento.
 */
public class FuncionNoche extends Funcion {
    public FuncionNoche() {
        this.tipo = "Noche";
        this.porcentajeDescuento = 0.0;
    }

    @Override
    public double getObtenerDescuento() {
        return porcentajeDescuento;
    }
}
