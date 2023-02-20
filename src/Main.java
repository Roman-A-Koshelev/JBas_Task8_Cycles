import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите любое целое положительное число:   ");
        int n = in.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма нечётных чисел от 1 до " + n + " = " + sum);
    }
}