import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1 = input.nextDouble();

        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        operator = input.next().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                break;
        }

        input.close();
    }
}
