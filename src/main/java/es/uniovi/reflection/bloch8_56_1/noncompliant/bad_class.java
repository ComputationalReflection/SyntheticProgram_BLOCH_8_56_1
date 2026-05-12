package es.uniovi.reflection.bloch8_56_1.noncompliant;
public class bad_class {

    // No CamelCase, ni snake_case permitido
    public int BAD_FIELD;
    public static final int badconstant = 10; // debería ser SNAKE_CASE
    public String Wrong_field_name;

    // No camelCase
    public void BADMETHOD() {
        System.out.println("Método con nombre en mayúsculas incorrecto");
    }

    // Método en snake_case (incorrecto)
    public void do_something_wrong() {
        for (int i = 0; i < BAD_FIELD; i++) {
            System.out.println("Loop con mala convención");
        }
    }
}