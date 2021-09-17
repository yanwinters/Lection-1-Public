package Package1;

import java.util.Arrays;

public class ClassWork6 {
    public static void main(String[] args) {
        int [] array = {12, 18, 13, 9, 7, 41, 81, 72, 65, 48, 29, 37, 91, 58, 2};
        System.out.print(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(" ");
        System.out.print(Arrays.toString(array));
        int [] modifiedArray = new int[array.length - 5];
        for (int i = 0; i <= 4; i++) {
            modifiedArray [i] = array [i];
        }
        for (int j = 5; j <= 9; j++) {
            modifiedArray [j] = array [j+5];
        }
        System.out.println(" ");
        System.out.print(Arrays.toString(modifiedArray));
    }
}
