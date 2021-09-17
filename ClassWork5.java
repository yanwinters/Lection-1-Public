package Package1;

public class ClassWork5 {
    public static void main(String[] args) {
        int [] array1 = {5, 21, 28, 29, 11, 14, 18, 23};
        int [] array2 = {9, 22, 28, 15, 4, 14, 19, 23};
        for (int i = 0; i < array2.length; i++) {
            if (array1[i]==array2[i]) {
                System.out.println("Элементы массивов, находящиеся под индексом " + i + " совпадают");
            }
            else {
                System.out.println("Элементы массивов, находящиеся под индексом " + i + " не совпадают");
            }
        }
    }
}
