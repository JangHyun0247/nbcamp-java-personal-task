package calculator;
//Operator 로부터 상속 받기
public class AddOperator implements Operator {
    //오버라이딩을 통해 그대로 가져다가 쓰는데 반환 값만 사칙연산별 계산 반환
    @Override
    public int operate(int num1, int num2){
        return num1 + num2;
    }
}
