import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = get.nextInt();
        System.out.println("Введите второе число");
        int b = get.nextInt();
        int sum = a + b;
        int multiply = a * b;
        System.out.println("Сумма равна " + sum);
        System.out.println("Произведение равно " + multiply);
    }

}
