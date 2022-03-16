package mundo;

/*
  Utility
*/
public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String celular;
    private int edad;


    public String getNombre() {
        return nombre;
    }

    public void conocerNombre1() {
        System.out.println("Nombre: " + getNombre());
    }

    public static void conocerNombre2() {
        System.out.println("Ahora sabes para que se usa el Static.");
    }
}