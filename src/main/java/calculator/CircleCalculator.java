package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {
    public CircleCalculator(ArrayList<Double> arithmeticList, ArrayList<Double> circleList) {
        super(arithmeticList, circleList); //super -> 부모 바라보기
    }

    public double circleArea(double radius) {
        double circleResult = 0;
        circleResult = Math.PI * radius * radius;
        ArrayList<Double> circleList = getCircleList();
        circleList.add(circleResult);
        return circleResult;
    }
}
