package superficies;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @version 1.2
 * @author damian
 */
public class Superficies {

    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo contenedor = new Modelo();

        String operacion = JOptionPane.showInputDialog("Operacion");
        if (operacion.equals("square")) {
            contenedor.setSideHeight(Float.parseFloat(JOptionPane.showInputDialog("Altura")));
            contenedor.setSideLength(Float.parseFloat(JOptionPane.showInputDialog("Ancho")));
            contenedor.setOperacion(operacion);

        } else if (operacion.equals("rectangle")) {
            contenedor.setSideHeight(Float.parseFloat(JOptionPane.showInputDialog("Altura")));
            contenedor.setSideLength(Float.parseFloat(JOptionPane.showInputDialog("Ancho")));
            contenedor.setOperacion(operacion);
        } else if (operacion.equals("triangle")) {
            contenedor.setSideLength(Float.parseFloat(JOptionPane.showInputDialog("Base")));
            contenedor.setHeight(Float.parseFloat(JOptionPane.showInputDialog("Altura triagulo")));
            contenedor.setOperacion(operacion);
        } else if (operacion.equals("circle")) {
            contenedor.setRadius(Float.parseFloat(JOptionPane.showInputDialog("Radio")));
            contenedor.setOperacion(operacion);
        }

        realizaOperacion(contenedor);
        Vista.imprimir(contenedor);
    }

    
    public static void realizaOperacion(Modelo contenedor) {
        float resultado = 0;
        switch (contenedor.getOperacion()) {
            case "square":
                resultado = contenedor.getSideLength() * contenedor.getSideLength();

                break;
            case "rectangle":
                resultado = contenedor.getSideHeight() * contenedor.getSideLength();

                break;
            case "triangle":
                resultado = (float) (contenedor.getHeight() * 0.5 * contenedor.getBaseLength());

                break;
            case "circle":

                resultado = (float) (3.14159265 * contenedor.getRadius() * contenedor.getRadius());

                break;
        }
        contenedor.setResultado(resultado);
    }

}
