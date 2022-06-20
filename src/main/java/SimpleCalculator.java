import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner get = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = get.nextInt();
        System.out.println("Введите второе число");
        int b = get.nextInt();
        calculator.printSumResult(a, b);
        calculator.printMultiplyResult(a, b);
    }

}
