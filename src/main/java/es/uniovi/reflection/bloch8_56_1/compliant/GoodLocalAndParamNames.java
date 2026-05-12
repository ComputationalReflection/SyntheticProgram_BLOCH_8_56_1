package es.uniovi.reflection.bloch8_56_1.compliant;

public class GoodLocalAndParamNames {

    public void processData(final int INPUT_NUMBER, String userName) {
        final int TOTAL_SUM = 0;
        String tempValue = "init";

        for (int index = 0; index < INPUT_NUMBER; index++) {
            tempValue += userName + index;
        }

        System.out.println("Result: " + TOTAL_SUM + " - " + tempValue);
    }

    public String combineStrings(final String FIRST, String secondValue) {
        final String RESULT_STRING = FIRST + "_" + secondValue;
        return RESULT_STRING;
    }

}
