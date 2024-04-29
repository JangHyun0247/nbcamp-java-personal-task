package calculator;

import java.util.ArrayList;

//Calculator 로부터 상속
public class ArithmeticCalculator extends Calculator {

    //ArithmeticCalculator 생성자 arithmeticList, circleList 매개변수로 받아 Calculator 생성자에게 던지기
    //따라서 자식인 ArithmeticCalculator 인스턴스, 초기화 하게 되면 부모인 CircleCalculator 는 따로 안해도 됨
    public ArithmeticCalculator(ArrayList<Double> arithmeticList, ArrayList<Double> circleList) {
        super(arithmeticList, circleList);
    }

    //매개변수로 사칙연산 숫자, 기호 받아 계산하는 메서드, 예외 발생 시 CalculatorException 로 던짐
    public double arithmeticResult(int num1, int num2, String op) throws CalculatorException {

        //지역변수, arithmeticResult 를 arithmeticList 에 넣기 위한 수단
        //arithmeticList 부모에 있는거를 쓴다고 생각하면 안됨, 따로 정의를 해야함
        double arithmeticResult = 0;

        //op 가 / 이고 분모가 0일 때 나눗셈의 분모는 0이 될 수 없습니다 라는 예외 생성 후 던짐
        if (op.equals("/") && num2 == 0) {
            throw new CalculatorException("나눗셈의 분모는 0이 될 수 없습니다.");
        }

        //올바르지 않은 사칙연산 기호가 아닐 때 Error operation 을 출력하는 예외를 생성해 던짐
        if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !op.equals("%")) {
            throw new CalculatorException("Error operation ");
        }

        //만약 + 라면 AddOperator 클래스의 operate 메서드 사용
        if (op.equals("+")) {
            arithmeticResult = new AddOperator().operate(num1, num2);
        } else if (op.equals("-")) {
            arithmeticResult = new SubtractOperator().operate(num1, num2);
        } else if (op.equals("*")) {
            arithmeticResult = new MultiplyOperator().operate(num1, num2);
        } else if (op.equals("/")) {
            arithmeticResult = new DivideOperator().operate(num1, num2);
        } else if (op.equals("%")) {
            arithmeticResult = new ModOperator().operate(num1, num2);
        }

        //Calculator 에서 생성한 get 메서드를 통해 arithmeticList 를 가져오기
        ArrayList<Double> arithmeticList = getArithmeticList();
        //arithmeticResult 값 arithmeticList 에 저장
        arithmeticList.add(arithmeticResult);
        return arithmeticResult;


    }

    public void removeFirstResult() {
        ArrayList<Double> arithmeticList = getArithmeticList();
        if (!arithmeticList.isEmpty()) {
            arithmeticList.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
}
