// Вычисление n-ного треугольного числа. 
import java.util.Scanner;

public class homeWorkFirst {
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Введите число N: ");
    int n = iScanner.nextInt();
    iScanner.close();
    int T = n * (n + 1)/2; 
    System.out.printf("Вот вам и треугольное число == %d == \n", T); 
    System.out.printf("А вот и факториал этого числа == %d == \n", factorModule.factorial(n)); 
   } 
}