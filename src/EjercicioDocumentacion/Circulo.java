/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioDocumentacion;

/**Círculos
 *
 * @author Gastón Peterlana
 * 
 * @version 10-05-2019
 * Ejempo Github
 * Ejercicio Netbeans Github
 * Añadiendo documentación
 */
public class Circulo {
    //modificando proyecto para "Experimentar"
    private double centroX;
    private double centroY;
    private double radio;

    /**
     * Constructor
     * @param x centro: coordenada X.
     * @param y centro: coordenada Y.
     * @param r radio.
     */
    public Circulo(double x, double y, double r) {
        centroX = x;
        centroY = y;
        radio = r;
    }
    /**
     * Getter
     * @return centro: coordenada X. 
     */
    public double getCentroX() {
        return centroX;
    }

    /**
     * Calcula la longitud de la circunferencia (perímetro del círculo).
     * @return perímetro.
     */
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    /**
     * Desplaza el círculo a otro lugar
     * @param despX movimiento en el eje X.
     * @param despY movimiento en el eje Y.
     */
    public void mueve(double despX, double despY) {
        centroX = centroX + despX;
        centroY = centroY + despY;
    }
}
