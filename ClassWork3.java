package Package1;

import java.util.Scanner;

public class ClassWork3 {
    public static void main(String[] args) {
        System.out.println("Введите два числа в формате (n,m) без скобок, где n - целая часть числа, m - дробная часть числа.");
        Scanner borders = new Scanner(System.in);
        Double leftborder = borders.nextDouble();
        Double rightborder = borders.nextDouble();
        System.out.println("Вы ввели отрезок величиной " + "[" + leftborder + "; " + rightborder + "]");

        System.out.println("Введите число в формате (n,m) без скобок, где n - целая часть числа, m - дробная часть числа.");
        Scanner number = new Scanner(System.in);
        Double numberx = number.nextDouble();
        if (leftborder < numberx && numberx < rightborder) {
            System.out.println("Введённое число принадлежит заданному отрезку");
        }
        else {
            System.out.println("Введённое число не принадлежит заданному отрезку");
        }
    }
}
