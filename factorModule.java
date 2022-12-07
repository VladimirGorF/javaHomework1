// Вычислить n! (произведение чисел от 1 до n)

public class factorModule {
    
    public static int factorial(int n) {
        if (n == 1)return 1;
        return n * factorial(n - 1);
        }
    }
   