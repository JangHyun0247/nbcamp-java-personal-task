package calculator;
import java.util.ArrayList;

//TODO 추상화 해야함.
abstract class Calculator {

    //static 필드, 인스턴스 필드를 포함하지 않는 메소드인데 원의 넓이를 구할 때 생성자를 통한 초기화가 요구사항 이기에 사용할 수 없다
    //참조형 변수에서 final 을 사용하게 되면 해당 인스턴스는 상수가 된다

    //변수명이 arithmeticList 이고 double 형태의 ArrayList 컬렉션 필드 선언
    private final ArrayList<Double> resultList;

    //Calculator 생성자, 매개변수를 통해 필드값 초기화
    //App 클래스에서 부모로부터 상속 받은 자식 인스턴스 생성
    public Calculator(ArrayList<Double> resultList) {
        this.resultList = resultList;
    }

    // getter 메서드 추가, 다른 클래스에서 arithmeticList 가 private 접근제어자로 get 메서드를 통해 가져오기
    public ArrayList<Double> getResultList() {
        return this.resultList;
    }

    abstract void inquiryResult();
}