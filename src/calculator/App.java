package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double result = 0;

            System.out.print("첫 번째 정수를 입력해 주세요: ");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 정수를 입력해 주세요: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = scanner.nextLine();
            char c = operator.charAt(0);

            switch (c) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue;
                    } else {
                        result = (double) num1 / num2;
                    }
                    break;
                default:
                    System.out.println("연산자(+,-,*,/)를 입력해주세요.");
                    continue;
            }

            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까(enter)? (exit 입력 시 종료)");
            String exit = scanner.nextLine();
            if (exit.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }

}
/*1. 나눗셈은 소수점을 표현해야 하기에 result를 double로 받아준다.

2. 양의 정수 2개를 nextInt로 받아준다.

3. 이후 nextLine() 받아야 하기에 남아있는 \n 을 nextLine()으로 읽어준다.

3. 사칙 연산 기호를 받아준다. char로 바로 받고 싶었으나 nextChar()가 없는 관계로 nextLine()으로 받고 chatAt(0) 사용하여 변수 c에 담아주었다.

4. switch 문을 사용해 변수 c의 연산기호별 result 값을 변경해준다. 연산기호를 입력하지 않았을 시 default로 예외처리한다.

5. 나누기 연산자의 경우 0으로 나눌 수 없기에. 컴파일 오류가 나지만 사용자를 고려하여 0으로 나눌 시 if로 예외처리 한다.

6. 첫 번째, 두 번째 정수를 입력할 때 사용자가 문자열을 입력하여 InputMismatchException 발생할 수 있기에 예외처리*/