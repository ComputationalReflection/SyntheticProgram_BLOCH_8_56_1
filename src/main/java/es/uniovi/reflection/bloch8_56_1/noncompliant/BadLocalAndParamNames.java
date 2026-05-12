

package es.uniovi.reflection.bloch8_56_1.noncompliant;

public class BadLocalAndParamNames {

    public void Process_Data(int INPUT_NUMBER, String user_name) {
        int TOTAL_SUM = 0;
        String TempValue = "init";

        for (int INDEX = 0; INDEX < INPUT_NUMBER; INDEX++) {
            TOTAL_SUM += INDEX;
            TempValue += user_name + INDEX;
        }
    }

    public String combine_Strings(String FIRST, String second_value) {
        String RESULT_STRING = FIRST + "_" + second_value;
        return RESULT_STRING;
    }

    public void WrongParamName(double TOTALAmount, double tax_RATE) {
        double FINAL_PRICE = TOTALAmount + (TOTALAmount * tax_RATE);
        System.out.println("Price: " + FINAL_PRICE);
    }
}
