package mundo;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/*
  Utility
 */
public class Calculadora {
    private int datoA;
    private int datoB;
    private int resultado = 0;

    DecimalFormat dosDecimales = new DecimalFormat("#.##");

    /* Constructor */
    public Calculadora(int datoA, int datoB) {
        this.datoA = datoA;
        this.datoB = datoB;
    }

    /* Método Sumar */
    public void sumarDatos() {
        resultado = (datoA + datoB);
        JOptionPane.showMessageDialog(null, "La suma total es = " + resultado, "Suma TotaL", JOptionPane.INFORMATION_MESSAGE);
    }

    /* Método Restar */
    public void restarDatos() {
        resultado = (datoA - datoB);
        JOptionPane.showMessageDialog(null, "La resta total es = " + resultado, "Resta TotaL", JOptionPane.INFORMATION_MESSAGE);
    }

    /* Método Multiplicar */
    public void multiplicarDatos() {
        resultado = (datoA * datoB);
        JOptionPane.showMessageDialog(null, "La multiplicación total es = " + resultado, "Multiplicación TotaL", JOptionPane.INFORMATION_MESSAGE);
    }

    /* Método Dividir */
    public void dividirDatos() {
        float a = datoA, b = datoB;
        float divisionTotal = (a / b);
        JOptionPane.showMessageDialog(null, "La división total es = " + dosDecimales.format(divisionTotal), "División Total", JOptionPane.INFORMATION_MESSAGE);
    }

    /* Método MostrarTodo */
    public void mostrarTodosDatos() {
        int sumaTotal = (datoA + datoB);
        int restaTotal = (datoA - datoB);
        int multiplicacionTotal = (datoA * datoB);

        // Convierto el INT a FLOAT
        float a = datoA, b = datoB;
        float divisionTotal = (a / b);
        JOptionPane.showMessageDialog(null, "La suma total es = " + sumaTotal + "\n" +
                "La resta total es = " + restaTotal + "\n" +
                "La multiplicación total es = " + multiplicacionTotal + "\n" +
                "La división total es = " + dosDecimales.format(divisionTotal) + "\n", "Todas las operaciones son:", JOptionPane.INFORMATION_MESSAGE);
    }
}