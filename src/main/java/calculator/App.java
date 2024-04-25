package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String more;
        do {
            //음수를 입력하면 양수로 입력하라는 창이 나오고 다시 입력하라는 창
            int num1;
            do {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextInt();
                if (num1 < 0) {
                    System.out.print("양의 정수를 입력해주세요!  ");
                }
            } while (num1 < 0);

            int num2;
            do {
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextInt();
                if (num2 < 0) {
                    System.out.print("양의 정수를 입력해주세요!  ");
                }
            } while (num2 < 0);

            System.out.print("사칙연산 기호를 입력하세요 : "); // +, - , *, /
            char op = sc.next().charAt(0);

            int result = 0;
            switch (op) {
                case '+':
                    result = num1 + num2;
                    System.out.println("결과: " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println("결과: " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println("결과: " + result);
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("분모에 0을 넣을 수 없습니다.");
                    } else result = num1 / num2;
                    System.out.println("결과: " + result);
                    break;

                default:
                    System.out.println("Error result");
            }

            System.out.print("더 계산하시겠습니까? (exit) 입력 시 종료 : "); //
            more = sc.next();

        } while(!more.equals("exit"));
    }
}
