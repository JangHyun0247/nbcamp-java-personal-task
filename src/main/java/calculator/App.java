package calculator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class App {


    public static void main(String[] args) throws CalculatorException {
        int num1; //첫 번째 숫자를 받기 위한 선언
        int num2; //두 번째 숫자를 받기 위한 선언

        //CircleCalculator 클래스에 있는 circleCalculator 생성자 인스턴스, 매개변수 arithmeticList 와 circleList 필드 타입 가져와 초기화와 그릇 만들기
        //만든 이유 : CircleCalculator 에 있는 메서드를 사용하기 위해서 (원의 넓이 구하는 circleArea 를 사용)
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());

        //ArithmeticCalculator 클래스에 있는 circleCalculator 생성자 인스턴스, 매개변수 arithmeticList 와 circleList 필드 타입 가져와 초기화와 그릇 만들기
        //만든 이유 : ArithmeticCalculator 에 있는 메서드를 사용하기 위해서 (원의 넓이 구하는 circleArea 를 사용)
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(new ArrayList<>());

        //변수명이 sc인 시스템에서 입력받는걸 매개변수로 설정한 Scanner 생성
        Scanner sc = new Scanner(System.in);

        //사칙연산을 할지 원을 넓이를 구할지 선택하는 입력 창
        System.out.print("operate(사칙연산), circle(원의 넓이) : ");
        //operate 입력 시 operate 계산, circle 입력 시 circle 계산
        if (Objects.equals(sc.next(), "operate")){
            //계산 한번 끝나도 exit 치기 전까지 계산 반복문
            do {
                //만약 음수를 입력받으면 양수 입력 받는 반복문
                do {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = sc.nextInt();
                    if (num1 < 0) {
                        System.out.print("양의 정수를 입력해주세요!  ");
                    }
                } while (num1 < 0);
                //만약 음수를 입력받으면 양수 입력 받는 반복문
                do {
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = sc.nextInt();
                    if (num2 < 0) {
                        System.out.print("양의 정수를 입력해주세요!  ");
                    }
                } while (num2 < 0);
                //----------------------------------------------------------------
                System.out.print("사칙연산 기호를 입력하세요 : "); // +, - , *, /
                char op = sc.next().charAt(0);      //.next() String 으로 받아 charAt(0) 을 통해 문자 하나

                //arithmeticCalculator -> ArithmeticCalculator 가르키고, arithmeticResult 메서드를 가져옴
                //op를 박싱한 이유는 .valueOf 를 사용하기 위해서
                System.out.println("연산 결과는 : " +
                        arithmeticCalculator.arithmeticResult(num1, num2, String.valueOf(op)));

                // remove 를 입력 받기 위한 창, 순서는 sout 으로 질문 후 scanner 를 통한 대답
                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력) : ");

                // scanner 로 입력받아 remove 이면 arithmeticCalculator -> ArithmeticCalculator 의
                // removeFirstResult() 메서드 호출
                if (Objects.equals(sc.next(), "remove")) {
                    arithmeticCalculator.removeFirstResult();

                //ArithmeticList 에 값이 비어있다면 print 읽어오기
                } else if (arithmeticCalculator.getResultList().isEmpty()) {
                    System.out.println("삭제할 결과가 없습니다.");
                }

                //inquiry 를 입력 받기 위한 창, 그 값 inquiry1 에 저장
                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");

                //inquiry1 에 값이 inquiry 라면 arithmeticCalculator -> ArithmeticCalculator 의
                //inquiryOpResult() 메서드는 Calculator 에 있지만 ArithmeticCalculator 는
                //인스턴스 생성 및 초기화를 동시에 부모 인스턴스도 생성하고 있다 이로 인해
                //부모로부터 상속을 받았기 때문에 부모에 선언되어 있는 메서드를 호출 할 수 있다
                if (Objects.equals(sc.next(), "inquiry")) {
                    arithmeticCalculator.inquiryResult();
                }

                //exit 을 통해 종료 할건지 입력 받는 창
                System.out.print("더 계산하시겠습니까? (exit) 입력 시 종료 : "); //
              //more1 에 저장해서 exit 문자열과 같지 않으면 반복, exit 일 때만 종료
            } while (!Objects.equals(sc.next(), "exit")); //exit 글씨와 more 입력 받은 값이 같지 않을 때까지 반복!
        }


        else if(Objects.equals(sc.next(), "circle")){
            do {
                System.out.print("반지름을 입력하세요 : ");
                double radius = sc.nextDouble();

                System.out.println("원의 넓이는 : " + circleCalculator.circleArea(radius));

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                if (Objects.equals(sc.next(), "inquiry")) {
                    circleCalculator.inquiryResult();
                }
                System.out.print("더 계산하시겠습니까? (exit) 입력 시 종료 : "); //
            } while (!Objects.equals(sc.next(),"exit"));
        }
    }
}
