package calculator;
import java.util.ArrayList;

public class Calculator {

    //static 필드, 인스턴스 필드를 포함하지 않는 메소드인데 원의 넓이를 구할 때 생성자를 통한 초기화가 요구사항 이기에 사용할 수 없다
    //참조형 변수에서 final 을 사용하게 되면 해당 인스턴스는 상수가 됨
   private ArrayList<Double> arithmeticList;
   private ArrayList<Double> circleList;

   public Calculator(ArrayList<Double> arithmeticList, ArrayList<Double> circleList) {
       this.arithmeticList = arithmeticList;
       this.circleList = circleList;
   }

    // getter 메서드 추가
    public ArrayList<Double> getArithmeticList() {
        return this.arithmeticList;
    }

    public ArrayList<Double> getCircleList() {
       return this.circleList;
    }

    // setter 메서드 추가
    public void setArithmeticList(ArrayList<Double> arithmeticList) {
       this.arithmeticList = arithmeticList;
    }

    public void setCircleList(ArrayList<Double> circleList) {
       this.circleList = circleList;
    }


    public void inquiryOpResult() {
        System.out.println(arithmeticList.toString());
    }

    public void inquiryCircleResult() {
        System.out.println(circleList.toString());
    }

}