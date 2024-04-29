package calculator;
import java.util.ArrayList;

public class Calculator {

    //static 필드, 인스턴스 필드를 포함하지 않는 메소드인데 원의 넓이를 구할 때 생성자를 통한 초기화가 요구사항 이기에 사용할 수 없다
    //final 한번 정해진 후 바꿀 수 없는 필드인데 바꿔 나가야한다
   private ArrayList<Double> arithmeticList;
   private ArrayList<Double> circleList;

   public Calculator(ArrayList<Double> arithmeticList, ArrayList<Double> circleList) {
       this.arithmeticList = arithmeticList;
       this.circleList = circleList;
   }

    // getter 메서드 추가
    public ArrayList<Double> getArithmeticList() {
        return new ArrayList<>(arithmeticList); // 새로운 ArrayList 를 반환하여 원본 데이터 보호
    }

    public ArrayList<Double> getCircleList() {
       return new ArrayList<>(circleList);
    }

    // setter 메서드 추가
    public void setArithmeticList(ArrayList<Double> arithmeticList) {
       this.arithmeticList = arithmeticList;
    }

    public void setCircleList(ArrayList<Double> circleList) {
       this.circleList = circleList;
    }

    public double calculate(int num1, int num2, String op) throws CalculatorException {
        double arithmeticResult = 0;

        if (op.equals("/") && num2 == 0) {
            throw new CalculatorException("나눗셈의 분모는 0이 될 수 없습니다.");
        }

        if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
            throw new CalculatorException("Error operation ");
        }

        if (op.equals("+")) {
            arithmeticResult = num1 + num2;
        } else if (op.equals("-")) {
            arithmeticResult = num1 - num2;
        } else if (op.equals("*")) {
            arithmeticResult = num1 * num2;
        } else if (op.equals("/")) {
            arithmeticResult = num1 / num2;
        }

        arithmeticList.add(arithmeticResult);
        return arithmeticResult;
    }

    public void removeFirstResult(){
        if (!arithmeticList.isEmpty()) {
            arithmeticList.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

    public void inquiryOpResult() {
        System.out.println(arithmeticList.toString());
    }

    public double circleArea(double radius) {
       double circleResult = 0;
       circleResult = Math.PI * radius * radius;
       circleList.add(circleResult);
       return circleResult;
    }

    public void inquiryCircleResult() {
        System.out.println(circleList.toString());
    }

}