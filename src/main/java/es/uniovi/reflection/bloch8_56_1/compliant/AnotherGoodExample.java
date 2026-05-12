package es.uniovi.reflection.bloch8_56_1.compliant;

public class AnotherGoodExample {

    // ✅ Campos en camelCase
    private int userId;
    private String productName;

    // ✅ Constante en SNAKE_CASE
    public static final double TAX_RATE = 0.21;

    // ✅ Métodos en camelCase
    public void processOrder() {
        System.out.println("Processing order for " + productName);
    }

    public int getUserId() {
        return userId;
    }
}


