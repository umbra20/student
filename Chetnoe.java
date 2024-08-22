package array;

import java.util.Arrays;

//TODO Вывод в консоль четных чисел массива
public class Chetnoe {
    public static void main(String[] args) {
        int[] a = {6, 117, 44, 5, 32, 81, 9};
        System.out.println("Вывод четных числе массива:");
        for (int num : a) {
            if (num % 2 == 0)
                System.out.println(num);
        }
    }
}
