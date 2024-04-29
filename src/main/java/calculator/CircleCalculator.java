package calculator;

import java.util.ArrayList;

//Calculator 로부터 상속 받는 CircleCalculator
public class CircleCalculator extends Calculator {

    public CircleCalculator(ArrayList<Double> resultList) {
        super(resultList); //super -> 부모 바라보기
    }

    public double circleArea(double radius) {
        double circleResult = 0;
        circleResult = Math.PI * radius * radius;
        ArrayList<Double> circleList = getResultList();
        circleList.add(circleResult);
        return circleResult;
    }
    public void inquiryCircleResult() {
        System.out.println(getResultList().toString());
    }
}
