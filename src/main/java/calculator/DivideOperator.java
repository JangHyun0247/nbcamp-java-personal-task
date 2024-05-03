package calculator;

public class DivideOperator implements Operator {
    @Override
    public int operate(int num1, int num2) throws ArithmeticException{
        if (num2 == 0) {
            throw new ArithmeticException("분모가 0");
        }
        return num1 / num2;
    }
}
