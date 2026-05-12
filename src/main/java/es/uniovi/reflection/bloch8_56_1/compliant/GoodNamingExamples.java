package es.uniovi.reflection.bloch8_56_1.compliant;

public class GoodNamingExamples {

    // ✅ Constantes: SNAKE_CASE
    public static final int MAX_COUNT = 10;
    public static final String DEFAULT_MESSAGE = "All good!";

    // ✅ Campos: camelCase
    private int totalItems;
    private String userName;

    // ✅ Métodos: camelCase
    public void calculateTotal() {
        int sum = 0;
        for (int i = 0; i < MAX_COUNT; i++) {
            sum += i;
        }
        totalItems = sum;
    }

    public String getUserName() {
        return userName;
    }

    // ✅ Ejemplo de subpaquete jerárquico y nombres en CamelCase
    public static class NestedExampleClass {
        private double itemPrice;

        public double calculateDiscount(double percentage) {
            return itemPrice - (itemPrice * percentage / 100);
        }
    }
}