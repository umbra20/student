package array;
//TODO - Вывести в консоль элементы массива в обратном порядке,
// т.е. начиная с 66.

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] num = {3, 87, 12, 98, 2, 4, 66};
        System.out.println("Массив в обратном порядке: ");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}





