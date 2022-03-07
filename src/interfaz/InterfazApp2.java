package interfaz;

import mundo.Calculadora;
import javax.swing.JOptionPane;

/**
 * @author JosuéRomero
 * @date 07/03/2022
 */
public class InterfazApp2 {

    public static void main(String[] args) {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres probar un rato este programa?r",
                "Cuadro de Dialogo", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if (opcion == 0) {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero para A"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Y un valor entero para B"));
            int dato = 0;

            // Instancia
            Calculadora cal = new Calculadora(a, b);
            do {
                dato = Integer.parseInt(JOptionPane.showInputDialog("¿Qué operación deseas realizar?. Presione:\n" +
                        "1. Sumar.\n" +
                        "2. Restar.\n" +
                        "3. Multiplicar.\n" +
                        "4. Dividir.\n" +
                        "5. Todas las operaciones.\n" +
                        "6. Salir."));

                switch (dato) {
                    case 1: cal.sumarDatos();
                        break;
                    case 2: cal.restarDatos();
                        break;
                    case 3: cal.multiplicarDatos();
                        break;
                    case 4: cal.dividirDatos();
                        break;
                    case 5: cal.mostrarTodosDatos();
                        break;
                    case 6: JOptionPane.showMessageDialog(null, "Gracias por haber ejecutado mi diminuto programa :)", "Gracias", JOptionPane.PLAIN_MESSAGE);
                        break;
                    default: JOptionPane.showMessageDialog(null, "[ERROR]: Por favor ingrese una opción válida.", "Opción errada", JOptionPane.ERROR_MESSAGE);
                }
            } while ((dato >= 1 && dato <= 5) || (dato <= 0 || dato >= 7));
        } else {
            JOptionPane.showMessageDialog(null, "Como no jugaste hasta la próxima :(");
        }
    }
}