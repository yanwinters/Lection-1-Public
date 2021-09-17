package Package1;

public class ClassWork1 {
    public static void main(String[] args) {
        String str1 = "1";
        String double1 = "2.9";
        int number1 = Integer.parseInt(str1.trim());
        int number2 = (int) Double.parseDouble(double1.trim());
        int sum = (number1 + number2);
        System.out.println(sum);
    }
}
