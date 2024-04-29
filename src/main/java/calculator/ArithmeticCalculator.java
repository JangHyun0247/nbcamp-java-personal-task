package calculator;

import java.util.ArrayList;

//arithmeticResult 지역변수, 리스트에 넣기 위한 수단
//arithmeticList 부모에 있는거를 쓴다고 생각하면 안됨, 따로 정의를 해야함
public class ArithmeticCalculator extends Calculator {
    public ArithmeticCalculator(ArrayList<Double> arithmeticList, ArrayList<Double> circleList) {
        super(arithmeticList, circleList);
    }

    AddOperator addOperator = new AddOperator();
    DivideOperator divideOperator = new DivideOperator();
    MultiplyOperator multiplyOperator = new MultiplyOperator();
    SubtractOperator subtractOperator = new SubtractOperator();

    public double arithmeticResult(int num1, int num2, String op) throws CalculatorException {
        double arithmeticResult = 0;
        if (op.equals("/") && num2 == 0) {
            throw new CalculatorException("나눗셈의 분모는 0이 될 수 없습니다.");
        }

        if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
            throw new CalculatorException("Error operation ");
        }

        if (op.equals("+")) {
            arithmeticResult = addOperator.operate (num1, num2);
        } else if (op.equals("-")) {
            arithmeticResult = subtractOperator.operate(num1,num2);
        } else if (op.equals("*")) {
            arithmeticResult = multiplyOperator.operate(num1,num2);
        } else if (op.equals("/")) {
            arithmeticResult = divideOperator.operate(num1,num2);
        }

        ArrayList<Double> arithmeticList = getArithmeticList(); //arithmeticList 는 부모에 있는걸 가져오기 위해 get 메서드를 써서 내가 만든거임
        arithmeticList.add(arithmeticResult);
        return arithmeticResult;


    }
    public void removeFirstResult(){
        ArrayList<Double> arithmeticList = getArithmeticList();
        if (!arithmeticList.isEmpty()) {
            arithmeticList.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}
