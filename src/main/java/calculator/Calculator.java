package calculator;
import java.util.ArrayList;

public class Calculator {

    ArrayList<Double> resultList = new ArrayList<>();

    public double calculate(int num1, int num2, String op) throws CalculatorException {
        double result = 0;

        if (op.equals("/") && num2 == 0) {
            throw new CalculatorException("나눗셈의 분모는 0이 될 수 없습니다.");
        }

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

        resultList.add(result);
        return result;
    }

}
