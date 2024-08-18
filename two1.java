public class two1 {
    public static void main(String[] args) {
        int x = 6;
        int y = 6;
        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println("Удачное совпадение");
        } else if (x % 3 == 0) {
            System.out.println("в переменой 'x' - Нет совпадений");
        } else if (y % 3 == 0) {
            System.out.println("в переменой 'y' - Нет совпадений");
        }

    }
}
