package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String more;
        int num1;
        int num2;

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


            //케이스 별로 계산 끝난 후 exit 받는 입력 창
            System.out.print("더 계산하시겠습니까? (exit) 입력 시 종료 : "); //
            more = sc.next();

        } while (!more.equals("exit")); //exit 글씨와 more 입력 받은 값이 같지 않을 때까지 반복!
    }
}

