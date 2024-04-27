package calculator;

import java.util.ArrayList;

public class Calculator {

    private int Double;
    ArrayList<Double> resultList = new ArrayList<>(Double);

    public double calculate(String op, int num1, int num2) {
        double result = 0;
        resultList.add(result);

        if(op.equals("+")) {
            result = num1 + num2;
        }
        else if(op.equals("-")) {
            result = num1 - num2;
        }
        else if(op.equals("*")) {
            result = num1 * num2;
        }
        else if(op.equals("/")) {
            result =  num1 / num2;
        }
        return result;
    }

}
