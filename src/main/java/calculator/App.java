package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws CalculatorException {
        int num1;
        int num2;
        double radius;
        String more1 ="";
        String more2 ="";

        Calculator calculator = new Calculator(new ArrayList<>(), new ArrayList<>());

        Scanner sc = new Scanner(System.in);

        System.out.println("operate(사칙연산), circle(원의 넓이)");
        String select = sc.next();
        if (select.equals("operate")){
            //계산 한번 끝나도 exit 치기 전까지 숫자, 사칙연산 계산 하는 반복문
            do {
                //음수를 입력하면 양수로 입력하라는 창이 나오고 다시 입력하라는 창
                do {
                    System.out.print("첫 번째 숫자를 입력하세요: ");
                    num1 = sc.nextInt();
                    if (num1 < 0) {
                        System.out.print("양의 정수를 입력해주세요!  ");
                    }
                } while (num1 < 0);
                //----------------------------------------------------------------
                do {
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = sc.nextInt();
                    if (num2 < 0) {
                        System.out.print("양의 정수를 입력해주세요!  ");
                    }
                } while (num2 < 0);
                //----------------------------------------------------------------
                System.out.print("사칙연산 기호를 입력하세요 : "); // +, - , *, /
                char op = sc.next().charAt(0);
                //----------------------------------------------------------------

                System.out.println(calculator.calculate(num1, num2, String.valueOf(op)));

                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력) : ");
                String remove = sc.next();
                if (remove.equals("remove")) {
                    calculator.removeFirstResult();
                } else if (calculator.getResultList().isEmpty()) {
                    System.out.println("삭제할 결과가 없습니다.");
                }

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                String inquiry1 = sc.next();
                if (inquiry1.equals("inquiry")) {
                    calculator.inquiryOpResult();
                }

                //케이스 별로 계산 끝난 후 exit 받는 입력 창
                System.out.print("더 계산하시겠습니까? (exit) 입력 시 종료 : "); //
                more1 = sc.next();

            } while (!more1.equals("exit")); //exit 글씨와 more 입력 받은 값이 같지 않을 때까지 반복!
        }


        else if(select.equals("circle")){

            do {
                System.out.print("반지름을 입력하세요 : ");
                radius = sc.nextDouble();

                System.out.println(calculator.circleArea(radius));

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) : ");
                String inquiry2 = sc.next();
                if (inquiry2.equals("inquiry")) {
                    calculator.inquiryCircleResult();
                }
                System.out.print("더 계산하시겠습니까? (exit) 입력 시 종료 : "); //
                more2 = sc.next();
            } while (more2.equals("exit"));
        }
    }
}
