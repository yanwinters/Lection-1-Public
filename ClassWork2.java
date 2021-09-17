package Package1;

import java.util.Scanner;

public class ClassWork2 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для вычисления её объёма: параллелепипед, шар или цилиндр.");
        Scanner figure = new Scanner(System.in);
        String figure1 = figure.next();
        Scanner scanin = new Scanner(System.in);
        if (figure1.equals("параллелепипед") || figure1.equals("Параллелепипед")) {
            System.out.println("Введите начальные параметры по порядку: высоту, ширину и длину.");
            int height = scanin.nextInt();
            int width = scanin.nextInt();
            int length = scanin.nextInt();
            int parallelepiped = (width*height*length);
            System.out.println("Объём параллелепипеда при заданных начальных условиях равен: " + parallelepiped);
        }

        else if (figure1.equals("шар") || figure1.equals("Шар")) {
            System.out.println("Введите радиус шара.");
            int radius = scanin.nextInt();
            final double pi = 3.1415926536;
            double ball = (pi*4*radius*radius/3);
            System.out.println("Объём шара при заданном радиусе равен: " + ball);
        }

        else if (figure1.equals("цилиндр") || figure1.equals("Цилиндр")) {
            System.out.println("Введите начальные параметры по порядку: высоту и радиус.");
            int radius = scanin.nextInt();
            int height = scanin.nextInt();
            final double pi = 3.1415926536;
            double cylinder = (pi*radius*radius*height);
            System.out.println("Объём цилиндра при заданном радиусе и высоте равен: " + cylinder);
        }

        else {
            System.out.println("Выберите, пожалуйста, фигуру при помощи правильной цифры.");
        }
    }
}
