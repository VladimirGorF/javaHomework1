// Реализовать простой калькулятор

import java.util.Scanner;

public class calcus {
    public static void main(String[] args) {
        try {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите число: ");
            int n = iScanner.nextInt();
            System.out.printf("Введите второе число ");
            int c = iScanner.nextInt();
            System.out.printf("Введите действие ");
            String oper = iScanner.next();
            iScanner.close();

            int sum = n + c;
            int dif = n - c;
            int div = n / c;
            int mult = n * c;

            switch (oper) {
                case "+":
                    System.out.printf("%d + %d = %d\n", n, c, sum);
                    break;
                case "-":
                    System.out.printf("%d - %d = %d\n", n, c, dif);
                    break;
                case "*":
                    System.out.printf("%d * %d = %d\n", n, c, mult);
                    break;
                case "/":
                    System.out.printf("%d / %d = %d\n", n, c, div);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Please use an integers only! Try again!");
        }

    }
}
