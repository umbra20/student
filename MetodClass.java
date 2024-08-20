public class MetodClass {
    int a;
    int b;

    public int sum(int a, int b) {
        System.out.println("Cумма чисел: " + (a + b));
        return a + b;
    }
    public int min(int a, int b) {
        System.out.println("Разность чисел: " + (a - b));
        return a - b;
    }
    public void doubl(int a, int b) {
        System.out.println("Умножение чисел: " + a * b);
    }
    public void chastnoe(int a, int b) {
        System.out.println("Частность чисел " + a / b);
    }
}
