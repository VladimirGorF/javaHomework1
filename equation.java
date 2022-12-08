// * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены 
// знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного 
// равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.List;
import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        try {

            System.out.println();
            Scanner iScanner = new Scanner(System.in);

            System.out.printf("Введите первое число со знаком вопроса до или после цифры: ");
            String qstr = iScanner.next();

            System.out.printf("Введите второе число со знаком вопроса до или после цифры: ");
            String wStr = iScanner.next();

            System.out.printf("Введите значение равенства ");
            int e = iScanner.nextInt();

            iScanner.close();

            String[] wlist = wStr.split("");
            String[] qlist = qstr.split("");

            for (int i = 0; i < qlist.length - 1; i++) { // ?1 первое число с вопросом впереди
                if (qlist[i].equals("?")) {
                    int q = Integer.parseInt(qlist[i + 1]);

                    for (int j = 0; j < 100; j += 10) {
                        int answer1 = e;
                        answer1 -= q + j;
                        for (int k = 0; k < wlist.length - 1; k++) { // ?2 второе число с вопросом впереди

                            if (wlist[k].equals("?")) {
                                int w = Integer.parseInt(wlist[k + 1]);
                                for (int l = 0; l < 100; l += 10) {
                                    int answer2 = e;
                                    answer2 -= w + l;
                                    if (e - answer1 - answer2 == 0) {
                                        System.out.println("Есть решение!!!");
                                        System.out.printf("%d + %d = %d\n", answer2, answer1, e);
                                        return;
                                    }
                                }
                            } else {
                                int w = Integer.parseInt(wlist[k]); // второе с вопросом после 2?
                                for (int m = 0; m < 10; m += 1) {
                                    int answer2 = e;
                                    answer2 -= w * 10 + m;
                                    if (e - answer1 - answer2 == 0) {
                                        System.out.println("Есть решение!!!");
                                        System.out.printf("%d + %d = %d\n", answer1, answer2, e);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int q = Integer.parseInt(qlist[i]); // 1? первое число с вопросом сзади

                    for (int j = 0; j < 10; j++) {
                        int answer1 = e;
                        answer1 -= q * 10 + j;
                        for (int k = 0; k < wlist.length - 1; k++) { // ?2 второе число с вопросом впереди

                            if (wlist[k].equals("?")) {
                                int w = Integer.parseInt(wlist[k + 1]);
                                for (int l = 0; l < 100; l += 10) {
                                    int answer2 = e;
                                    answer2 -= w + l;
                                    if (e - answer1 - answer2 == 0) {
                                        System.out.println("Есть решение!!!");
                                        System.out.printf("%d + %d = %d\n", answer2, answer1, e);
                                        return;
                                    }
                                }
                            } else {
                                int w = Integer.parseInt(wlist[k]); // второе с вопросом после 2?
                                for (int m = 0; m < 10; m += 1) {
                                    int answer2 = e;
                                    answer2 -= w * 10 + m;
                                    if (e - answer1 - answer2 == 0) {
                                        System.out.println("Есть решение!!!");
                                        System.out.printf("%d + %d = %d\n", answer1, answer2, e);
                                        return;
                                    }
                                }

                            }

                        }

                    }

                }
            }
            System.out.println("Решение этого уравнения не существует!");

        } catch (Exception e) {
            System.out.println("Пожалуйста вводите корректно!");
        }
    }
}
