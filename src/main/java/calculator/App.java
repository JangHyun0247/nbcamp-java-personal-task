package calculator;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String more;
        int[] intArray = new int[10]; //연산 결과 result 를 intArray 에 저장하고 count 수 올리기
        int count = 0;
        int num1;
        int result = 0;
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

            int num2;
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

            //사칙연산 기호 케이스별로 계산하고 result 에 저장 후 출력
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
                //------------------------------------------------------
                //사칙연산 기호를 잘못 넣으면 에러 발생
                default:
                    System.out.println("Error result");
            }
                //count 가 처음에 0이고 0번째에 result 넣고 이후 count 하나씩 증가시키면서 result 에 대입
                intArray[count] = result;
                count++;

            //케이스 별로 계산 끝난 후 exit 받는 입력 창
            System.out.print("더 계산하시겠습니까? (exit) 입력 시 종료 : "); //
            more = sc.next();
        //exit 글씨와 more 입력 받은 값이 같지 않을 때까지 반복!
        } while (!more.equals("exit"));
    }
}

