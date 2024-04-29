package calculator;
//extends 를 사용하는 상속이 아닌 인터페이스로 사용한 이유는
//extends 클래스 간의 상속을 위함이고 인터페이스는 연산자를 추상화, 코드의 재사용을 위해서이다
public interface Operator {
    int operate(int num1, int num2);
}
