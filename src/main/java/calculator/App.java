package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //음수를 입력하면 양수로 입력하라는 창이 나오고 다시 입력하라는 창
        int num1;
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = sc.nextInt();
            if (num1<0){
                System.out.print("양의 정수를 입력해주세요!  ");
            }
        } while (num1 < 0);

        int num2;
        do {
            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = sc.nextInt();
            if (num2<0){
                System.out.print("양의 정수를 입력해주세요!  ");
            }
        } while (num2 < 0);

    }
}
