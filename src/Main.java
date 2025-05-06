import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int[] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        double[] numbers2 = {1.57, 7.654, 9.986};
        char[] letters = {'a', 'b', 'c'};
        System.out.println("Задача 2.");
        for (int i = 0; i < numbers1.length; i++) {
            if (i == numbers1.length - 1) {
                System.out.println(numbers1[i]);
                break;
            }
            System.out.print(numbers1[i] + ", ");
        }
        for (int i = 0; i < numbers2.length; i++) {
            if (i == numbers2.length - 1) {
                System.out.println(numbers2[i]);
                break;
            }
            System.out.print(numbers2[i] + ", ");
        }
        for (int i = 0; i < letters.length; i++) {
            if (i == letters.length - 1) {
                System.out.println(letters[i]);
                break;
            }
            System.out.print(letters[i] + ", ");
        }
        System.out.println("Задача 3.");
        for (int i = numbers1.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println(numbers1[i]);
                break;
            }
            System.out.print(numbers1[i] + ", ");
        }
        for (int i = numbers2.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println(numbers2[i]);
                break;
            }
            System.out.print(numbers2[i] + ", ");
        }
        for (int i = letters.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(letters[i]);
                break;
            }
            System.out.print(letters[i] + ", ");
        }
        System.out.println("Задача 4.");
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] % 2 != 0) {
                numbers1[i]++;
            }
        }
        System.out.println("Массив после преобразования: " + Arrays.toString(numbers1));
    }
}