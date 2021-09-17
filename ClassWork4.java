package Package1;

import java.util.Scanner;

public class ClassWork4 {
    public static void main(String[] args) {
        Double leftborder = 7.2;
        Double rightborder = 11.7;
        for (int i = 1; i <= 127; ) {
            System.out.println("Введите число в формате (n,m) без скобок, где n - целая часть числа, m - дробная часть числа.");
            Scanner number = new Scanner(System.in);
            Double numberx = number.nextDouble();
            if (leftborder <= numberx && numberx <= rightborder) {
                System.out.println("Введённое число принадлежит заданному отрезку");
            }
            else {
                System.out.println("Введённое число не принадлежит заданному отрезку");
            }
            System.out.println("Выполнить операцию повторно ? (Да/Нет)");
            Scanner answer = new Scanner(System.in);
            String Answer = answer.next();
            if (Answer.equals("Да") || Answer.equals("да")) {
                continue;
            }
            else if (Answer.equals("Нет") || Answer.equals("нет")) {
                break;
            }
        }
    }
}
