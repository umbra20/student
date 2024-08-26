package array;

public class Sort {
    public static void main(String[] args) {

        double[] a = {2.2, 1.4, 6.9, 8.0, 10.5, 9.6};
        System.out.println("Сортировка массива по убыванию: ");
        for (double num : a) {

            System.out.print(num + " : ");
        }
        double count;
        do {
            count = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    double temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                }

            }

        }
        while (count > 0);
        System.out.println();
        for (double num : a) {
            System.out.print(num + " : ");
        }
    }
}
