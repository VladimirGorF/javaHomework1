// Вывести все простые числа от 1 до 1000

public class simpleNums {
    public static void main(String[] args) {
        int num = 1;
        System.out.println();
        System.out.print("А вот вам и простые числа от 1 до 1000, леди и джентльмены:\n 1 ");
        while(num < 1000){
            int x = 2;
            while(num%x != 0 && x < num){
                if (x == num - 1){
                    System.out.printf("%d ", num);
                }
                x++; 
            }
            num++;
        }
        System.out.println();
    }
}
