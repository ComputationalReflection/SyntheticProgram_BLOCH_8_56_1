package es.uniovi.reflection.bloch8_56_1.noncompliant;

public class Another_bad_class {
    // Campo estático final mal nombrado
    public static final String stringConstant = "ERROR";

    // No sigue camelCase
    public void BADMethodAgain() {
        System.out.println("Otra violación de convención");
    }
}