package calculator;
import java.util.ArrayList;

public class Calculator {

   private ArrayList<Double> resultList;
   private ArrayList<Double> cirleList;

   public Calculator(ArrayList<Double> resultList, ArrayList<Double> cirleList) {
       this.resultList = resultList;
       this.cirleList = cirleList;
   }

    // getter 메서드 추가
    public ArrayList<Double> getResultList() {
        return new ArrayList<>(resultList); // 새로운 ArrayList 를 반환하여 원본 데이터 보호
    }

    public ArrayList<Double> getCirleList() {
       return new ArrayList<>(cirleList);
    }

    // setter 메서드 추가
    public void setResultList(ArrayList<Double> resultList) {
       this.resultList = resultList;
    }

    public void setCirleList(ArrayList<Double> cirleList) {
       this.cirleList = cirleList;
    }

    public double calculate(int num1, int num2, String op) throws CalculatorException {
        double result = 0;

        if (op.equals("/") && num2 == 0) {
            throw new CalculatorException("나눗셈의 분모는 0이 될 수 없습니다.");
        }

        if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
            throw new CalculatorException("Error result ");
        }

        if (op.equals("+")) {
            result = num1 + num2;
        } else if (op.equals("-")) {
            result = num1 - num2;
        } else if (op.equals("*")) {
            result = num1 * num2;
        } else if (op.equals("/")) {
            result = num1 / num2;
        }

        resultList.add(result);
        return result;
    }

    public void removeFirstResult(){
        if (!resultList.isEmpty()) {
            resultList.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

    public void inquiryOpResult() {
        System.out.println(resultList.toString());
    }

    public double circleArea(double radius) {
       double circleResult = 0;
       double area = Math.PI * radius * radius;
       cirleList.add(circleResult);
       return circleResult;
    }

    public void inquiryCircleResult() {
        System.out.println(cirleList.toString());
    }

}