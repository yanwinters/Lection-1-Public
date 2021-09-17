package Package1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 127; i++) {
            System.out.println("Введите два числа, с которыми вы хотите взаимодействовать.");
            Scanner numbers = new Scanner(System.in);
            int number1 = numbers.nextInt();
            int number2 = numbers.nextInt();
            System.out.println("Выберите операцию (поддерживается сложение, вычитание, умножение и деление).");
            Scanner operation = new Scanner(System.in);
            String Operation = operation.next();
            if (Operation.equals("Сложение") || Operation.equals("сложение")) {
                int sum = number1 + number2;
                System.out.println("Результат, получившийся при сложении введённых цифр: " + sum);
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
            else if (Operation.equals("Вычитание") || Operation.equals("вычитание")) {
                int diff = number1 - number2;
                System.out.println("Результат, получившийся при вычитании введённых цифр: " + diff);
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
            else if (Operation.equals("Умножение") || Operation.equals("умножение")) {
                int multi = number1 * number2;
                System.out.println("Результат, получившийся при умножении введённых цифр: " + multi);
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
            else if (Operation.equals("Деление") || Operation.equals("деление")) {
                int div = number1 / number2;
                System.out.println("Результат, получившийся при делении введённых цифр: " + div);
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
}
