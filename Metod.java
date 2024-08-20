//TODO Написать методы вычисления суммы, разности,
// произведения и частного. Методы суммы и разности
// принимают входные параметры a и b и возвращают результат
// соответствующих операций. Методы произведения и частного
// необходимо написать с типом возвращаемого значения void
// (ничего не возвращают) и результат этих операций внутри
// метода
// выводится в консоль методом System.out.println().

public class Metod {
    public static void main(String[] args) {
        MetodClass metodClass = new MetodClass();
        metodClass.sum(7, 8);
        metodClass.min(9, 6);
        metodClass.doubl(8, 8);
        metodClass.chastnoe(10, 1);
    }
}