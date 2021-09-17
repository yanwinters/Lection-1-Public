package Package1;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        String[] names = {"Дима", "Егор", "Лера", "Лиза", "Настя", "Маша", "Леонид", "Иван", "Андрей"};
        System.out.println("Введите имя с клавиатуры.");
        Scanner name = new Scanner(System.in);
        String Name = name.next();
        int c = 0;
        for (int i = 0; i < names.length; i++) {
            if (Name.equals(names[i])) {
                c = i;
            }
        }
        if (c != 0) {
            System.out.println("Человек с введённым Вами именем проживает в общежитии.");
        }
        else {
            System.out.println("Человек с введённым Вами именем не проживает в общежитии.");
        }
    }
}
